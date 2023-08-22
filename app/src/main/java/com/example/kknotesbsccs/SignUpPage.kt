package com.example.kknotesbsccs

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.kknotesbsccs.databinding.ActivitySignUpPageBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class SignUpPage : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpPageBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private var db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mTextView = findViewById<TextView>(R.id.alreadyHaveAccountLogIn)
        val mString = "Already have an account? Log-In"
        val mSpannableString = SpannableString(mString)
        mSpannableString.setSpan(UnderlineSpan(), 0, mSpannableString.length, 0)
        mTextView.text = mSpannableString

        firebaseAuth = FirebaseAuth.getInstance()

        binding.alreadyHaveAccountLogIn.setOnClickListener {
            val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
        }

        val progressBar = binding.progressBar

        binding.signupButton.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val username = binding.userName.text.toString().trim()
            val email = binding.emailAddress.text.toString().trim()
            val pass = binding.password.text.toString().trim()
            val confirmPass = binding.confirmPassword.text.toString().trim()
            if (username.isNotEmpty() && email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    if (pass == confirmPass) {
                        firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                            if (it.isSuccessful) {
                                val user = firebaseAuth.currentUser
                                val profileUpdates = UserProfileChangeRequest.Builder()
                                    .setDisplayName(username)
                                    .build()
                                user?.updateProfile(profileUpdates)
                                    ?.addOnCompleteListener { task ->
                                        if (task.isSuccessful) {
                                            Log.d(TAG, "User profile updated.")
                                        }
                                    }

                                val userMap = hashMapOf(
                                    "username" to username,
                                    "email" to email,
                                    "password" to pass
                                )
                                val userId = FirebaseAuth.getInstance().currentUser!!.uid
                                db.collection("user").document(userId).set(userMap)
                                    .addOnSuccessListener {
                                        Toast.makeText(
                                            this,
                                            "Great to have you! Signup successful. Begin your note-taking journey.",
                                            Toast.LENGTH_LONG
                                        ).show()
                                        binding.userName.text.clear()
                                        binding.emailAddress.text.clear()
                                        binding.password.text.clear()
                                        binding.confirmPassword.text.clear()
                                    }
                                    .addOnFailureListener {
                                        progressBar.visibility = View.INVISIBLE
                                        Toast.makeText(this, "Sign-Up failed!", Toast.LENGTH_SHORT)
                                            .show()
                                    }
                                progressBar.visibility = View.INVISIBLE
                                val intent = Intent(this, LogInPage::class.java)
                                startActivity(intent)
                            } else {
                                progressBar.visibility = View.INVISIBLE
                                Toast.makeText(this, "Email address already in use or Wrong.", Toast.LENGTH_SHORT).show()
                            }
                        }
                    } else {
                        progressBar.visibility = View.INVISIBLE
                        Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    progressBar.visibility = View.INVISIBLE
                    Toast.makeText(this, "Please enter a valid email address.", Toast.LENGTH_SHORT).show()
                }
            } else {
                progressBar.visibility = View.INVISIBLE
                Toast.makeText(this, "Empty Fields Are not Allowed!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}