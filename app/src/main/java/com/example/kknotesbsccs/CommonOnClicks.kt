package com.example.kknotesbsccs

import android.content.Context
import android.content.Intent
import android.widget.TextView

fun CommonOnClicks(textView: TextView, context: Context, targetActivityClass: Class<*>) {
    textView.setOnClickListener {
        val intent = Intent(context, targetActivityClass)
        context.startActivity(intent)
    }
}