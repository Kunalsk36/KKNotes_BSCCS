package com.example.kknotesbsccs

import android.Manifest
import android.app.AlertDialog
import android.app.DownloadManager
import android.content.Context
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.view.MenuItem
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth

class PDFView : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth
    private val PERMISSION_REQUEST_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdfview)

        firebaseAuth = FirebaseAuth.getInstance()

        val navigationView = findViewById<NavigationView>(R.id.navigationView)
        val headerView = navigationView.getHeaderView(0)
        val userNameOfPerson = headerView.findViewById<TextView>(R.id.userNameOfPerson)
        val emailOfPerson = headerView.findViewById<TextView>(R.id.emailOfPerson)
        val userId = FirebaseAuth.getInstance().currentUser!!.uid

        drawerLayout = findViewById(R.id.drawerlayout)
        val navView: NavigationView = findViewById(R.id.navigationView)
        val toolbar = findViewById<MaterialToolbar>(R.id.topAppBar)

        NavigationDrawerHelper.setupNavigationDrawer(
            this,
            drawerLayout,
            navView,
            toolbar,
            userNameOfPerson,
            emailOfPerson,
            userId
        )

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.isIndeterminate = true

        val link = intent.getStringExtra("pdf_url")
        val wv = findViewById<WebView>(R.id.webview)
        wv.loadUrl("$link")
        wv.webViewClient = Client(progressBar)
        val ws = wv.settings
        ws.javaScriptEnabled = true
        wv.settings.javaScriptCanOpenWindowsAutomatically = true
        wv.clearCache(true)
        wv.clearHistory()
        wv.setDownloadListener { _, _, _, _, _ ->
            checkPermissionAndDownload()
            Toast.makeText(this@PDFView, "Downloading....", Toast.LENGTH_SHORT).show()
        }
    }

    private fun checkPermissionAndDownload() {

        val granted = PackageManager.PERMISSION_GRANTED

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != granted) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), PERMISSION_REQUEST_CODE)
        } else {
            startDownload()
        }
    }

    fun startDownload() {
        val downloadlink = intent.getStringExtra("download_link")
        val pdfName = intent.getStringExtra("pdf_name")
        val fileUrl = "$downloadlink"
        val fileName = "$pdfName"
        val request = DownloadManager.Request(Uri.parse(fileUrl))
        request.setTitle(fileName)
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
        val manager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        manager.enqueue(request)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startDownload()
            } else {
                //startDownload()
                Toast.makeText(this, "permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private inner class Client(private val progressBar: ProgressBar) : WebViewClient() {

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            view?.loadUrl(url!!)
            return true
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            progressBar.isIndeterminate = false
            progressBar.scaleX = 0f
        }

        override fun onReceivedError(
            webView: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            try {
                webView?.stopLoading()
            } catch (e: Exception) {
            }
            if (webView?.canGoBack() == true) {
                webView.goBack()
            }
            webView?.loadUrl("about:blank")
            val alertDialog = AlertDialog.Builder(this@PDFView).create()
            alertDialog.setTitle("Error")
            alertDialog.setMessage("Check your internet connection and Try again.")
            alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Try Again") { dialog, which ->
                finish()
                startActivity(intent)
            }
            alertDialog.show()
            super.onReceivedError(webView, errorCode, description, failingUrl)
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawerlayout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}