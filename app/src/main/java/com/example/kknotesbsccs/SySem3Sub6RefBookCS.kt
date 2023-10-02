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

class SySem3Sub6RefBookCS : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sy_sem3_sub6_ref_book_cs)

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

    fun refbook1Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1rVeoLdaJlSpj-V_DMR10rymjCh5qi363/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1rVeoLdaJlSpj-V_DMR10rymjCh5qi363"
        )
        intent.putExtra(
            "pdf_name",
            "HTML_CSS_Ref_Book"
        )
        startActivity(intent)
    }

    fun refbook2Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1nAr-8TlDkOOxjmSGi_sZDKG2mf1nTsq9/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1nAr-8TlDkOOxjmSGi_sZDKG2mf1nTsq9"
        )
        intent.putExtra(
            "pdf_name",
            "PHP_MySQL_JavaScript_Ref_Book"
        )
        startActivity(intent)
    }

    fun refbook3Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1gaH606wKurcVULNcbugWy8XQNQ0hkzZh/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1gaH606wKurcVULNcbugWy8XQNQ0hkzZh"
        )
        intent.putExtra(
            "pdf_name",
            "PHP_MySQL_JavaScript_and_HTML5_Ref_Book"
        )
        startActivity(intent)
    }
}