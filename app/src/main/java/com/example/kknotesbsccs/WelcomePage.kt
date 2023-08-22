package com.example.kknotesbsccs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth

class WelcomePage : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        firebaseAuth = FirebaseAuth.getInstance()
    }

    fun SignUpClick(view: View) {
        intent = Intent(this, SignUpPage::class.java)
        startActivity(intent)
    }

    fun loginclick(view: View) {
        intent = Intent(this, LogInPage::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        if (firebaseAuth.currentUser != null) {
            val intent = Intent(this, MainActivityFirst::class.java)
            startActivity(intent)
        }
    }
}