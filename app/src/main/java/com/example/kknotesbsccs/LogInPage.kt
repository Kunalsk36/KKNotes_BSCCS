package com.example.kknotesbsccs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.kknotesbsccs.databinding.ActivityLogInPageBinding
import com.google.firebase.auth.FirebaseAuth

class LogInPage : AppCompatActivity() {

    private lateinit var binding: ActivityLogInPageBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_page)

        binding = ActivityLogInPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mTextView = findViewById<TextView>(R.id.signUpTextView)
        val mString = "Don't have an account? Sign-Up"
        val mSpannableString = SpannableString(mString)
        mSpannableString.setSpan(UnderlineSpan(), 0, mSpannableString.length, 0)
        mTextView.text = mSpannableString

        firebaseAuth = FirebaseAuth.getInstance()
        binding.signUpTextView.setOnClickListener {
            val intent = Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }

        val progressBar = binding.progressBar

        binding.loginButton.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val email = binding.emailAddress.text.toString().trim()
            val pass = binding.password.text.toString().trim()
            if (email.isNotEmpty() && pass.isNotEmpty()) {
                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(
                            this,
                            "Congratulations! Your notes await. Let's get started!",
                            Toast.LENGTH_LONG
                        ).show()
                        progressBar.visibility = View.INVISIBLE
                        val intent = Intent(this, MainActivityFirst::class.java)
                        startActivity(intent)
                    } else {
                        progressBar.visibility = View.INVISIBLE
                        Toast.makeText(this, "Invalid login credentials or check network connection", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                progressBar.visibility = View.INVISIBLE
                Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()
            }
        }

        val forgotpass = binding.forgotpassword
        forgotpass.setOnClickListener{
            progressBar.visibility = View.VISIBLE
            val email = binding.emailAddress.text.toString().trim()
            if (email.isNullOrEmpty()){
                Toast.makeText(applicationContext, "Please enter your email and click on 'Forgot Password'", Toast.LENGTH_SHORT).show()
                progressBar.visibility = View.INVISIBLE
            }
            else{
                firebaseAuth.sendPasswordResetEmail(email).addOnSuccessListener {
                    Toast.makeText(this, "Check inbox for password reset link. Also, check spam or junk folder.", Toast.LENGTH_LONG).show()
                    binding.password.text.clear()
                    progressBar.visibility = View.INVISIBLE
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Apologies, failed to send reset link. Try again later.", Toast.LENGTH_LONG).show()
                    binding.emailAddress.text.clear()
                    binding.password.text.clear()
                    progressBar.visibility = View.INVISIBLE
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        if (firebaseAuth.currentUser != null) {
            val intent = Intent(this, MainActivityFirst::class.java)
            startActivity(intent)
        }
    }
}