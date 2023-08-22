package com.example.kknotesbsccs

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class FySem2Sub2Notes : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fy_sem2_sub2_notes)

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
        CommonOnClicks(navFy, this, FySemSelect::class.java)
        val navSem1 = findViewById<TextView>(R.id.navSem1)
        CommonOnClicks(navSem1, this, FYSem2SubSelect::class.java)
        val navSem1Sub1 = findViewById<TextView>(R.id.navFYSem1Sub1)
        CommonOnClicks(navSem1Sub1, this, FySem2Sub2::class.java)

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

    fun notes1Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/18vDbtrvbYS3RroY6JSZT1Cga6x2zRMVp/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=18vDbtrvbYS3RroY6JSZT1Cga6x2zRMVp"
        )
        intent.putExtra(
            "pdf_name",
            "Date_and_time_object"
        )
        startActivity(intent)
    }

    fun notes2Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1yqQwPwIwy8FV3w2gkBUsEE1rtuRizWcn/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1yqQwPwIwy8FV3w2gkBUsEE1rtuRizWcn"
        )
        intent.putExtra(
            "pdf_name",
            "python_codes"
        )
        startActivity(intent)
    }

    fun notes3Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1nQanbZ2CU6n4XtiHh03SY_ojkCx3z1Z3/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1nQanbZ2CU6n4XtiHh03SY_ojkCx3z1Z3"
        )
        intent.putExtra(
            "pdf_name",
            "Python_Exception"
        )
        startActivity(intent)
    }

    fun notes4Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/12uVwBgCoznuLj9gB70Pu-HZk9rqqKmIn/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=12uVwBgCoznuLj9gB70Pu-HZk9rqqKmIn"
        )
        intent.putExtra(
            "pdf_name",
            "Python_Inheritance"
        )
        startActivity(intent)
    }

    fun notes5Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1NxOr0x7SFmhuTc-JiEfvqqG2-FNg6wAt/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1NxOr0x7SFmhuTc-JiEfvqqG2-FNg6wAt"
        )
        intent.putExtra(
            "pdf_name",
            "Python_OOPs_Concepts"
        )
        startActivity(intent)
    }

    fun notes6Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1BtWR3kOPlTqXwusQkYMpXyf0VsC8ARBg/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1BtWR3kOPlTqXwusQkYMpXyf0VsC8ARBg"
        )
        intent.putExtra(
            "pdf_name",
            "Python_Regular_Expression"
        )
        startActivity(intent)
    }

    fun notes7Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1kg2vZYbTXtccs9YPp0YDQ9f3zf550vmh/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1kg2vZYbTXtccs9YPp0YDQ9f3zf550vmh"
        )
        intent.putExtra(
            "pdf_name",
            "Python_thread_handling"
        )
        startActivity(intent)
    }

    fun notes8Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1ngHTi4xEFx1_IzoIrSrceZn5m1ZJ1i4X/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1ngHTi4xEFx1_IzoIrSrceZn5m1ZJ1i4X"
        )
        intent.putExtra(
            "pdf_name",
            "Tkinter_Notes"
        )
        startActivity(intent)
    }

    fun notes9Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1dNyPBb1RnemkexuXIopQEMSuvnNZuA9w/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1dNyPBb1RnemkexuXIopQEMSuvnNZuA9w"
        )
        intent.putExtra(
            "pdf_name",
            "Python_Question_Bank"
        )
        startActivity(intent)
    }
}
