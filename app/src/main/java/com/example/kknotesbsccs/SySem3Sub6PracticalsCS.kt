package com.example.kknotesbsccs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth

class SySem3Sub6PracticalsCS : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sy_sem3_sub6_practicals_cs)

        firebaseAuth = FirebaseAuth.getInstance()

        val navigationView = findViewById<NavigationView>(R.id.navigationView)
        val headerView = navigationView.getHeaderView(0)
        val userNameOfPerson = headerView.findViewById<TextView>(R.id.userNameOfPerson)
        val emailOfPerson = headerView.findViewById<TextView>(R.id.emailOfPerson)
        val userId = FirebaseAuth.getInstance().currentUser!!.uid

        drawerLayout = findViewById(R.id.drawerlayout)
        val navView: NavigationView = findViewById(R.id.navigationView)
        val toolbar = findViewById<MaterialToolbar>(R.id.topAppBar)

        val navFy = findViewById<TextView>(R.id.navFY)
        CommonOnClicks(navFy, this, SySemSelect::class.java)
        val navSem1 = findViewById<TextView>(R.id.navSem1)
        CommonOnClicks(navSem1, this, SYSem3SubSelect::class.java)
        val navSem1Sub1 = findViewById<TextView>(R.id.navFYSem1Sub1)
        CommonOnClicks(navSem1Sub1, this, SySem3Sub6CS::class.java)

        NavigationDrawerHelper.setupNavigationDrawer(
            this,
            drawerLayout,
            navView,
            toolbar,
            userNameOfPerson,
            emailOfPerson,
            userId
        )
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

    fun prac1Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1iQ8CKFo8y7s6epzPmY-AeKWoAhGZ1q5k/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1iQ8CKFo8y7s6epzPmY-AeKWoAhGZ1q5k"
        )
        intent.putExtra(
            "pdf_name",
            "Web_Tech_Practical_1_KK"
        )
        startActivity(intent)
    }

    fun prac2Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1DRifXUw8Seu-G0EWWZTYpNMvOGLz36NL/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1DRifXUw8Seu-G0EWWZTYpNMvOGLz36NL"
        )
        intent.putExtra(
            "pdf_name",
            "Web_Tech_Practical_2_KK"
        )
        startActivity(intent)
    }

    fun prac3Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1jznJfzzlZjAQZRP4h8OlIFk4MnGpmyjc/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1jznJfzzlZjAQZRP4h8OlIFk4MnGpmyjc"
        )
        intent.putExtra(
            "pdf_name",
            "Web_Tech_Practical_3_KK"
        )
        startActivity(intent)
    }

    fun prac4Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1nkk8uWhtBtp_5-enWOUNG8VGdOTVR-Go/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1nkk8uWhtBtp_5-enWOUNG8VGdOTVR-Go"
        )
        intent.putExtra(
            "pdf_name",
            "Web_Tech_Practical_4_KK"
        )
        startActivity(intent)
    }

    fun prac5Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1VVVkVGvcIK3VowPng7fyIDYu_FwdBd_i/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1VVVkVGvcIK3VowPng7fyIDYu_FwdBd_i"
        )
        intent.putExtra(
            "pdf_name",
            "Web_Tech_Practical_5_KK"
        )
        startActivity(intent)
    }

    fun prac6Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1CgLaddVPnG24ubNXhEsVkmscXKt0Zd75/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1CgLaddVPnG24ubNXhEsVkmscXKt0Zd75"
        )
        intent.putExtra(
            "pdf_name",
            "Web_Tech_Practical_6_KK"
        )
        startActivity(intent)
    }

    fun prac7Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/10PCuQhBNwzYhu_c0RshBH4AdK1BofmiM/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=10PCuQhBNwzYhu_c0RshBH4AdK1BofmiM"
        )
        intent.putExtra(
            "pdf_name",
            "Web_Tech_Practical_7_KK"
        )
        startActivity(intent)
    }

    fun prac8Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1zfJzajuBPBY7Wk6ZvVaalJZUm9dNYfOm/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1zfJzajuBPBY7Wk6ZvVaalJZUm9dNYfOm"
        )
        intent.putExtra(
            "pdf_name",
            "Web_Technology_Practicals_Theory_KK"
        )
        startActivity(intent)
    }
}