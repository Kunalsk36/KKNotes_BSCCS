package com.example.kknotesbsccs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.TextView

class splashScreen : AppCompatActivity() {
    private val SPLASH_SCREEN = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash_screen)

        val logoView = findViewById<View>(R.id.kk_logo_variant)
        val textView = findViewById<TextView>(R.id.KKNotes)
        val textView2 = findViewById<TextView>(R.id.BSCCS)
        val top = AnimationUtils.loadAnimation(this, R.anim.top)
        val bottom = AnimationUtils.loadAnimation(this, R.anim.bottom)
        logoView.animation = top
        textView.animation = bottom
        textView2.animation = bottom
        Handler().postDelayed({
            val intent = Intent(this, WelcomePage::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN.toLong())
    }
}