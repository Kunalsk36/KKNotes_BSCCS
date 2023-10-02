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

class SySem4Sub3CaseStudyCS : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sy_sem4_sub3_case_study_cs)

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
        CommonOnClicks(navSem1, this, SYSem4SubSelect::class.java)
        val navSem1Sub1 = findViewById<TextView>(R.id.navFYSem1Sub1)
        CommonOnClicks(navSem1Sub1, this, SySem4Sub3CS::class.java)

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

    fun cases1Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1-OOd_l__qAJk35ZH-5xZ6xn0LRQXZLsT/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1-OOd_l__qAJk35ZH-5xZ6xn0LRQXZLsT"
        )
        intent.putExtra(
            "pdf_name",
            "SE_LMS_Case_Study_KKNotes"
        )
        startActivity(intent)
    }

    fun cases2Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/13-qa51YWB8WuvOofSG9ry53kSevT1P3A/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=13-qa51YWB8WuvOofSG9ry53kSevT1P3A"
        )
        intent.putExtra(
            "pdf_name",
            "SE_SAMS_Case_Study_ZP_KKNotes"
        )
        startActivity(intent)
    }

    fun cases3Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1yt2pi_0vhkm5N6WXlxXZbtRwMpj9Zgw4/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1yt2pi_0vhkm5N6WXlxXZbtRwMpj9Zgw4"
        )
        intent.putExtra(
            "pdf_name",
            "SE_DABS_Case_Study_RK_KKNotes"
        )
        startActivity(intent)
    }

    fun cases4Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1rRSMkHPROCua4vfmMdjly7qJIiD-gn5s/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1rRSMkHPROCua4vfmMdjly7qJIiD-gn5s"
        )
        intent.putExtra(
            "pdf_name",
            "SE_RBS_Case_Study_TS_KKNotes"
        )
        startActivity(intent)
    }

    fun cases5Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1xVI0HXoEpK8XU05O_4tqfR2Mk3G3a5kN/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1xVI0HXoEpK8XU05O_4tqfR2Mk3G3a5kN"
        )
        intent.putExtra(
            "pdf_name",
            "SE_VLMS_Case_Study_ML_KKNotes"
        )
        startActivity(intent)
    }
}