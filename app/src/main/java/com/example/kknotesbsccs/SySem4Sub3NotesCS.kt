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

class SySem4Sub3NotesCS : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sy_sem4_sub3_notes_cs)

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
            "https://drive.google.com/file/d/18PzxtNzKRRWh0M-P-bCspy9nz4MW_Wyd/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=18PzxtNzKRRWh0M-P-bCspy9nz4MW_Wyd"
        )
        intent.putExtra(
            "pdf_name",
            "SE_UNIT_I_KKNotes"
        )
        startActivity(intent)
    }

    fun notes2Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/11NN7GPHWd195Em8z3KDkJHa1WGdtp7VT/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=11NN7GPHWd195Em8z3KDkJHa1WGdtp7VT"
        )
        intent.putExtra(
            "pdf_name",
            "SE_UNIT_II_KKNotes"
        )
        startActivity(intent)
    }

    fun notes3Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1KLsG0gU1kQH3yoFMD1zmJEmHnIIsuSqD/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1KLsG0gU1kQH3yoFMD1zmJEmHnIIsuSqD"
        )
        intent.putExtra(
            "pdf_name",
            "SE_UNIT_III_KKNotes"
        )
        startActivity(intent)
    }

    fun notes4Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1opy7WbUGMQG0mcUTTHqIN2G3zX12F81y/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1opy7WbUGMQG0mcUTTHqIN2G3zX12F81y"
        )
        intent.putExtra(
            "pdf_name",
            "SE_Ques_Bank_KKNotes"
        )
        startActivity(intent)
    }

    fun notes5Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/13ooyKannpjmRw1Pds6EN-ldeq9s676LN/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=13ooyKannpjmRw1Pds6EN-ldeq9s676LN"
        )
        intent.putExtra(
            "pdf_name",
            "SE_Notes_TM_KKNotes"
        )
        startActivity(intent)
    }

    fun notes6Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1FdoXbOx7jZXIeQDwZfB6AHdyVGcPKPsv/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1FdoXbOx7jZXIeQDwZfB6AHdyVGcPKPsv"
        )
        intent.putExtra(
            "pdf_name",
            "SE_Class_Diagrams_KKNotes"
        )
        startActivity(intent)
    }

    fun notes7Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1SThvMVtEe62iI5R3JB9gqJugOYSX4Ero/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1SThvMVtEe62iI5R3JB9gqJugOYSX4Ero"
        )
        intent.putExtra(
            "pdf_name",
            "SE_Component_Diagrams_KKNotes"
        )
        startActivity(intent)
    }

    fun notes8Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1HHCoEbZWI5E9kOe84MOt1n-6CHblFQS6/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1HHCoEbZWI5E9kOe84MOt1n-6CHblFQS6"
        )
        intent.putExtra(
            "pdf_name",
            "SE_Entity_Relationship_Diagrams_KKNotes"
        )
        startActivity(intent)
    }

    fun notes9Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/13DamFzF3l9cakFYTZ8bNSNEmcbL6ZFTu/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=13DamFzF3l9cakFYTZ8bNSNEmcbL6ZFTu"
        )
        intent.putExtra(
            "pdf_name",
            "SE_Sequence_Diagrams_KKNotes"
        )
        startActivity(intent)
    }

    fun notes10Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1EvJCVo8SStqeYiL4VuTxD5v05Tc85bGv/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1EvJCVo8SStqeYiL4VuTxD5v05Tc85bGv"
        )
        intent.putExtra(
            "pdf_name",
            "SE_StateTransition_Diagrams_KKNotes"
        )
        startActivity(intent)
    }

    fun notes11Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1v8BTj7jJZHbBy2hus9ykadJzHjej9Dy7/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1v8BTj7jJZHbBy2hus9ykadJzHjej9Dy7"
        )
        intent.putExtra(
            "pdf_name",
            "SE_Use_case_Diagrams_KKNotes"
        )
        startActivity(intent)
    }
}