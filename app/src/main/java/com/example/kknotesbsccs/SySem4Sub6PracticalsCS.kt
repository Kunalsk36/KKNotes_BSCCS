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

class SySem4Sub6PracticalsCS : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sy_sem4_sub6_practicals_cs)

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
        CommonOnClicks(navSem1Sub1, this, SySem4Sub6CS::class.java)

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
            "https://drive.google.com/file/d/1rhDoznbqo40IWJLneDf-9_TDV2eWqRin/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1rhDoznbqo40IWJLneDf-9_TDV2eWqRin"
        )
        intent.putExtra(
            "pdf_name",
            "ADD_Practical_1_KKNotes"
        )
        startActivity(intent)
    }

    fun prac2Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/181NCWK186Islt52Q2HknebcIMQcFJSLx/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=181NCWK186Islt52Q2HknebcIMQcFJSLx"
        )
        intent.putExtra(
            "pdf_name",
            "ADD_Practical_2_KKNotes"
        )
        startActivity(intent)
    }

    fun prac3Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1svlKhp9S41j2M41DrDSDa8VSMtarnIXq/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1svlKhp9S41j2M41DrDSDa8VSMtarnIXq"
        )
        intent.putExtra(
            "pdf_name",
            "ADD_Practical_3_KKNotes"
        )
        startActivity(intent)
    }

    fun prac4Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1uJ0xNzSA-qHF1xwZJ0zb9K3jnbGYTQKV/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1uJ0xNzSA-qHF1xwZJ0zb9K3jnbGYTQKV"
        )
        intent.putExtra(
            "pdf_name",
            "ADD_Practical_4_KKNotes"
        )
        startActivity(intent)
    }

    fun prac5Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1hS_gaoJGyMdVZbrIKx-lg3dxFhcZQQT5/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1hS_gaoJGyMdVZbrIKx-lg3dxFhcZQQT5"
        )
        intent.putExtra(
            "pdf_name",
            "ADD_Practical_5_KKNotes"
        )
        startActivity(intent)
    }

    fun prac6Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1MIIRNGvB4JIHf7I_nyA1owzHm9w9hak4/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1MIIRNGvB4JIHf7I_nyA1owzHm9w9hak4"
        )
        intent.putExtra(
            "pdf_name",
            "ADD_Practical_6_KKNotes"
        )
        startActivity(intent)
    }

    fun prac7Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1Jjv9ni59dQ-Ojl4WIVw8eI2EnNYQ_n6r/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1Jjv9ni59dQ-Ojl4WIVw8eI2EnNYQ_n6r"
        )
        intent.putExtra(
            "pdf_name",
            "ADD_Practical_7_KKNotes"
        )
        startActivity(intent)
    }

    fun prac8Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1Mtl5QzPBrYkFaI8xgh8ttfWC3mx6zFvq/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1Mtl5QzPBrYkFaI8xgh8ttfWC3mx6zFvq"
        )
        intent.putExtra(
            "pdf_name",
            "ADD_Practical_8_KKNotes"
        )
        startActivity(intent)
    }

    fun prac9Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1klwH2ps_JzmAp9JcP-rpskimgwe3EIKr/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1klwH2ps_JzmAp9JcP-rpskimgwe3EIKr"
        )
        intent.putExtra(
            "pdf_name",
            "ADD_Practicals_Theory_KKNotes"
        )
        startActivity(intent)
    }
}