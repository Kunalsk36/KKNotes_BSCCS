package com.example.kknotesbsccs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth

class FYSem1SubSelect : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fysem1_sub_select)

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

    fun sem1p1dsaClick(view: View) {
        intent = Intent(this, FySem1Sub1::class.java)
        startActivity(intent)
    }

    fun sem1p2pythonClick(view: View) {
        intent = Intent(this, FySem1Sub2::class.java)
        startActivity(intent)
    }

    fun sem1p3linuxClick(view: View) {
        intent = Intent(this, FySem1Sub3::class.java)
        startActivity(intent)
    }

    fun sem1p4ostClick(view: View) {
        intent = Intent(this, FySem1Sub4::class.java)
        startActivity(intent)
    }

    fun sem1p5dmClick(view: View) {
        intent = Intent(this, FySem1Sub5::class.java)
        startActivity(intent)
    }

    fun sem1p6dsClick(view: View) {
        intent = Intent(this, FySem1Sub6::class.java)
        startActivity(intent)
    }

    fun sem1p7ssClick(view: View) {
        intent = Intent(this, FySem1Sub7::class.java)
        startActivity(intent)
    }
}