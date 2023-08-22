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

class SySem4Sub6NotesCS : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sy_sem4_sub6_notes_cs)

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
            "https://drive.google.com/file/d/1DQyDudeAjqW29ptvnElPSwkwwnS8Wkev/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1DQyDudeAjqW29ptvnElPSwkwwnS8Wkev"
        )
        intent.putExtra(
            "pdf_name",
            "MongoDB_KKNotes"
        )
        startActivity(intent)
    }

    fun notes2Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1g0MdcQdhQ111ffu2hlOWsMktzz-HVqR1/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1g0MdcQdhQ111ffu2hlOWsMktzz-HVqR1"
        )
        intent.putExtra(
            "pdf_name",
            "MongoDB_QuestionAns_KKNotes"
        )
        startActivity(intent)
    }

    fun notes3Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/12aqfTcci-aLVHqER4zKRVQu3kOuNy4J9/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=12aqfTcci-aLVHqER4zKRVQu3kOuNy4J9"
        )
        intent.putExtra(
            "pdf_name",
            "UNIT_III_Android_App_Dev_KKNotes"
        )
        startActivity(intent)
    }

    fun notes4Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1uOfA5e2ISOQF9In0ZMTLz487FTQj6ZlC/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1uOfA5e2ISOQF9In0ZMTLz487FTQj6ZlC"
        )
        intent.putExtra(
            "pdf_name",
            "Nodejs_QuestionAns_KKNotes"
        )
        startActivity(intent)
    }

    fun notes5Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1Jm-PJM1R9q-3mMN0YQvNlBlTtnQyp6nI/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1Jm-PJM1R9q-3mMN0YQvNlBlTtnQyp6nI"
        )
        intent.putExtra(
            "pdf_name",
            "AngularJS_KKNotes"
        )
        startActivity(intent)
    }

    fun notes6Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1STFpZAx30zO1OOmPnprbqVw5d_eUZw4f/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1STFpZAx30zO1OOmPnprbqVw5d_eUZw4f"
        )
        intent.putExtra(
            "pdf_name",
            "AngularJS_QB_KKNotes"
        )
        startActivity(intent)
    }

    fun notes7Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://drive.google.com/file/d/1ohyb8LTvcR-GpKaEdly1qzw1hG5RFXNu/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1ohyb8LTvcR-GpKaEdly1qzw1hG5RFXNu"
        )
        intent.putExtra(
            "pdf_name",
            "Unit_III_Advanced_Application_Development_KKNotes"
        )
        startActivity(intent)
    }
}