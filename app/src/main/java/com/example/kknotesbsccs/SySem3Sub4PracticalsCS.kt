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

class SySem3Sub4PracticalsCS : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sy_sem3_sub4_practicals_cs)

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
        CommonOnClicks(navSem1Sub1, this, SySem3Sub4CS::class.java)

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
            "https://drive.google.com/file/d/1sQuyGW5GmQTUgPJdvNPGdLwKTYIwAy-l/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1sQuyGW5GmQTUgPJdvNPGdLwKTYIwAy-l"
        )
        intent.putExtra(
            "pdf_name",
            "PL_SQL_Practical_1"
        )
        startActivity(intent)
    }

    fun prac2Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1bXMjpfpIeiiXgHf-4RFM6q05wNu15Xyu/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1bXMjpfpIeiiXgHf-4RFM6q05wNu15Xyu"
        )
        intent.putExtra(
            "pdf_name",
            "PL_SQL_Practical_2"
        )
        startActivity(intent)
    }

    fun prac3Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1b5-vAiEpIX_OdKVU3QtocnSRmgRuQ8gG/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1b5-vAiEpIX_OdKVU3QtocnSRmgRuQ8gG"
        )
        intent.putExtra(
            "pdf_name",
            "PL_SQL_Practical_3"
        )
        startActivity(intent)
    }

    fun prac4Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1Law6ZAkwK3lVK26c_YRzKzpoLlngpRtc/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1Law6ZAkwK3lVK26c_YRzKzpoLlngpRtc"
        )
        intent.putExtra(
            "pdf_name",
            "PL_SQL_Practical_4"
        )
        startActivity(intent)
    }

    fun prac5Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1Kx-gfYALjXRmxxaVdyzbFNDdhXmH3FWE/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1Kx-gfYALjXRmxxaVdyzbFNDdhXmH3FWE"
        )
        intent.putExtra(
            "pdf_name",
            "PL_SQL_Practical_5"
        )
        startActivity(intent)
    }

    fun prac6Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1DQlgWZx_9t38e9WjmUCUm5Rkq5CFns5i/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1DQlgWZx_9t38e9WjmUCUm5Rkq5CFns5i"
        )
        intent.putExtra(
            "pdf_name",
            "PL_SQL_Practical_6"
        )
        startActivity(intent)
    }

    fun prac7Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1ZbTiWsJhlHqKPhple_knW-sOE-vgf9Oo/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1ZbTiWsJhlHqKPhple_knW-sOE-vgf9Oo"
        )
        intent.putExtra(
            "pdf_name",
            "PL_SQL_Practical_7"
        )
        startActivity(intent)
    }

    fun prac8Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/11v9E5gxuCWA9Rl9Wq8cLxUCjRL3XT5K9/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=11v9E5gxuCWA9Rl9Wq8cLxUCjRL3XT5K9"
        )
        intent.putExtra(
            "pdf_name",
            "PL_SQL_Practical_8"
        )
        startActivity(intent)
    }

    fun prac9Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1QJ9nt7r2Rp1prdvAr2dDKe3-9qkLskOY/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1QJ9nt7r2Rp1prdvAr2dDKe3-9qkLskOY"
        )
        intent.putExtra(
            "pdf_name",
            "PL_SQL_Practical_9"
        )
        startActivity(intent)
    }
}