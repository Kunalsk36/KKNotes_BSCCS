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

class SySem3Sub1NotesCS : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sy_sem3_sub1_notes_cs)

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
            "https://drive.google.com/file/d/1T7Wzu9vTbWoY2K8PAWtYR2hBGR0ZZjcz/view?usp=sharing"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1T7Wzu9vTbWoY2K8PAWtYR2hBGR0ZZjcz"
        )
        intent.putExtra(
            "pdf_name",
            "OS_Notes"
        )
        startActivity(intent)
    }

    fun notes2Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/1p3h7XjWygsw0GCM-mnW6vA0yr4m3ydiF/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1p3h7XjWygsw0GCM-mnW6vA0yr4m3ydiF"
        )
        intent.putExtra(
            "pdf_name",
            "Intro_And_Types_Of_OS_Notes"
        )
        startActivity(intent)
    }

    fun notes3Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/1_48nAuLg9FHYupqkyWjoxIDXx0NN7Xf7/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1_48nAuLg9FHYupqkyWjoxIDXx0NN7Xf7"
        )
        intent.putExtra(
            "pdf_name",
            "Operating_System_Structure"
        )
        startActivity(intent)
    }

    fun notes4Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/14TxFW91_c7vVmiqEVag86HdZizJrbuGu/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=14TxFW91_c7vVmiqEVag86HdZizJrbuGu"
        )
        intent.putExtra(
            "pdf_name",
            "Process_Management"
        )
        startActivity(intent)
    }

    fun notes5Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/1mVKnoz4O99j5Orccfoabysg7Nn8oLph8/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1mVKnoz4O99j5Orccfoabysg7Nn8oLph8"
        )
        intent.putExtra(
            "pdf_name",
            "Deadlock"
        )
        startActivity(intent)
    }

    fun notes6Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/1ZatFptgnRspnMsDjD5-SsZkAZFspqlI_/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1ZatFptgnRspnMsDjD5-SsZkAZFspqlI_"
        )
        intent.putExtra(
            "pdf_name",
            "DISK_SCHEDULING"
        )
        startActivity(intent)
    }

    fun notes7Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/16EobH4H6GCRePj0z4LhHFKuDbxsdfYtl/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=16EobH4H6GCRePj0z4LhHFKuDbxsdfYtl"
        )
        intent.putExtra(
            "pdf_name",
            "File_System_Implementation"
        )
        startActivity(intent)
    }

    fun notes8Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/1tjts-IUxfqxexmNSwSLT9Fny92tY4SbF/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1tjts-IUxfqxexmNSwSLT9Fny92tY4SbF"
        )
        intent.putExtra(
            "pdf_name",
            "File_System_Interface"
        )
        startActivity(intent)
    }

    fun notes9Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/1LYhsPhC9yAbfuaIL022JKK4bDsjaw3hv/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1LYhsPhC9yAbfuaIL022JKK4bDsjaw3hv"
        )
        intent.putExtra(
            "pdf_name",
            "Light_weight_processes"
        )
        startActivity(intent)
    }

    fun notes10Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/1CpVd-LaJ7XfgJDOTGj1Elb7sAdVJnEvz/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1CpVd-LaJ7XfgJDOTGj1Elb7sAdVJnEvz"
        )
        intent.putExtra(
            "pdf_name",
            "Memory_Management"
        )
        startActivity(intent)
    }

    fun notes11Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/1GhAciqGhKA0EiJV0NvZMcpap4nooK1cg/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1GhAciqGhKA0EiJV0NvZMcpap4nooK1cg"
        )
        intent.putExtra(
            "pdf_name",
            "PROCESS_SYNCHRONIZATION"
        )
        startActivity(intent)
    }

    fun notes12Click(view: View) {
        Toast.makeText(this, "Please wait, loading...", Toast.LENGTH_LONG).show()
        val intent = Intent(applicationContext, PDFView::class.java)
        intent.putExtra(
            "pdf_url",
            "https://docs.google.com/presentation/d/1uMGdWgnCdQvLBOyCasPziDBvmZOjCWeU/edit?usp=sharing&ouid=113886755869808690827&rtpof=true&sd=true"
        )
        intent.putExtra(
            "download_link",
            "https://drive.google.com/uc?export=download&id=1uMGdWgnCdQvLBOyCasPziDBvmZOjCWeU"
        )
        intent.putExtra(
            "pdf_name",
            "Virtual_Memory"
        )
        startActivity(intent)
    }
}