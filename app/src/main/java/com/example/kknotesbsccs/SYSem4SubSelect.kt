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

class SYSem4SubSelect : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sysem4_sub_select)

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

    fun sem4p1tocClick(view: View) {
        intent = Intent(this, SySem4Sub1CS::class.java)
        startActivity(intent)
    }

    fun sem4p2cnClick(view: View) {
        intent = Intent(this, SySem4Sub2CS::class.java)
        startActivity(intent)
    }

    fun sem4p3seClick(view: View) {
        intent = Intent(this, SySem4Sub3CS::class.java)
        startActivity(intent)
    }

    fun sem4p4iotClick(view: View) {
        intent = Intent(this, SySem4Sub4CS::class.java)
        startActivity(intent)
    }

    fun sem4p5androidadClick(view: View) {
        intent = Intent(this, SySem4Sub5CS::class.java)
        startActivity(intent)
    }

    fun sem4p6advanceadp6Click(view: View) {
        intent = Intent(this, SySem4Sub6CS::class.java)
        startActivity(intent)
    }

    fun sem4p7meClick(view: View) {
        intent = Intent(this, SySem4Sub7CS::class.java)
        startActivity(intent)
    }
}