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

class SySem4Sub2PracticalsCS : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sy_sem4_sub2_practicals_cs)

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
        CommonOnClicks(navSem1Sub1, this, SySem4Sub2CS::class.java)

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
            "https://drive.google.com/file/d/1tF4FwcHettfW5okgImOix9_9nOZuVEet/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1tF4FwcHettfW5okgImOix9_9nOZuVEet"
        )
        intent.putExtra(
            "pdf_name",
            "CN_Practical_1_KK"
        )
        startActivity(intent)
    }

    fun prac2Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1C6Cb4Japkw-4jm-_qsKxbbFN4vVLmm8Z/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1C6Cb4Japkw-4jm-_qsKxbbFN4vVLmm8Z"
        )
        intent.putExtra(
            "pdf_name",
            "CN_Practical_2_KK"
        )
        startActivity(intent)
    }

    fun prac3Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1t-5uRl1wYtqsFnfgRIhPXD72D_pMC-H3/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1t-5uRl1wYtqsFnfgRIhPXD72D_pMC-H3"
        )
        intent.putExtra(
            "pdf_name",
            "CN_Practical_3_KK"
        )
        startActivity(intent)
    }

    fun prac4Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1WyrkOSNeddGB1-zKtsUX51f10ox1Dq4h/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1WyrkOSNeddGB1-zKtsUX51f10ox1Dq4h"
        )
        intent.putExtra(
            "pdf_name",
            "CN_Practical_4_KK"
        )
        startActivity(intent)
    }

    fun prac5Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1kVaIXpDTplOL4OiNb1v56ctqAQMTjovW/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1kVaIXpDTplOL4OiNb1v56ctqAQMTjovW"
        )
        intent.putExtra(
            "pdf_name",
            "CN_Practical_5_KK"
        )
        startActivity(intent)
    }

    fun prac6Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1T09M_4nJW0UiS22q1YajuXb0jR3o4Yto/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1T09M_4nJW0UiS22q1YajuXb0jR3o4Yto"
        )
        intent.putExtra(
            "pdf_name",
            "CN_Practical_6_KK"
        )
        startActivity(intent)
    }

    fun prac7Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1cfBhITuXYpMgfqhmWWONG3Mgwo4PIXAW/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1cfBhITuXYpMgfqhmWWONG3Mgwo4PIXAW"
        )
        intent.putExtra(
            "pdf_name",
            "CN_Practical_7_KK"
        )
        startActivity(intent)
    }

    fun prac8Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1s_MYLmpp197sJyMQhOFsLLCDluxcVicJ/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1s_MYLmpp197sJyMQhOFsLLCDluxcVicJ"
        )
        intent.putExtra(
            "pdf_name",
            "CN_Practicals_Theory_KK"
        )
        startActivity(intent)
    }

    fun prac9Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/14uv29bjDPrZRp6_RgzaSpEOZYWUkzcOm/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=14uv29bjDPrZRp6_RgzaSpEOZYWUkzcOm"
        )
        intent.putExtra(
            "pdf_name",
            "CN_Practicals_Theory_KK"
        )
        startActivity(intent)
    }

    fun prac10Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/17juCC9zGMiNFaMNsqXATbVsRviaVQ2MO/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=17juCC9zGMiNFaMNsqXATbVsRviaVQ2MO"
        )
        intent.putExtra(
            "pdf_name",
            "CN_Practicals_Theory_KK"
        )
        startActivity(intent)
    }
}