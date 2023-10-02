package com.example.kknotesbsccs

import android.content.Intent
import android.net.Uri
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import androidx.fragment.app.Fragment

object NavigationDrawerHelper {
    fun setupNavigationDrawer(
        activity: AppCompatActivity,
        drawerLayout: DrawerLayout,
        navigationView: NavigationView,
        toolbar: MaterialToolbar,
        userNameTextView: TextView,
        emailTextView: TextView,
        userId: String
    ) {
        toolbar.navigationIcon = ContextCompat.getDrawable(activity, R.drawable.menu_icon_two)
        toolbar.setNavigationOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        val toggle = ActionBarDrawerToggle(activity, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        activity.supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    val homeIntent = Intent(activity, MainActivityFirst::class.java)
                    activity.startActivity(homeIntent)
                }
                R.id.nav_share -> {
                    val shareIntent = Intent().apply {
                        action = Intent.ACTION_SEND
                        type = "text/plain"
                        putExtra(
                            Intent.EXTRA_TEXT,
                            "Upgrade your study experience with our app's resources for seamless studying! \uD83D\uDCDA\uD83E\uDD17 \n" +
                                    "\n" +
                                    "Download the latest version of the KKNotes BSCCS Application using the following link: \n" +
                                    "https://drive.google.com/file/d/1qiXaghGc8pwmkEGUKjiDtxDFAFv0j5CV/view?usp=sharing  \n" +
                                    "\n" +
                                    "In case the above link doesn't work, you can try the alternative link: \n" +
                                    "https://drive.google.com/uc?export=download&id=1qiXaghGc8pwmkEGUKjiDtxDFAFv0j5CV \n" +
                                    "\n" +
                                    " \uD83D\uDCD6 Carry your study materials effortlessly with our app, ensuring ultimate convenience and accessibility anytime, anywhere! \uD83D\uDE09✨"
                        )
                    }
                    val chooserIntent = Intent.createChooser(shareIntent, "Choose One")
                    activity.startActivity(chooserIntent)
                }
                R.id.nav_feedback -> {
                    val feedbackIntent = Intent(Intent.ACTION_VIEW)
                    feedbackIntent.data = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSeiuUbM28LqG4FgkqTIjWg3oPSc9LOzFklGQoPZWF6-6tCQbA/viewform?usp=sf_link")
                    activity.startActivity(feedbackIntent)
                }
                R.id.nav_privacypolicy -> replaceFragment(activity, privacy_policy_fragment())
                R.id.nav_logout -> {
                    FirebaseAuth.getInstance().signOut()
                    val logoutIntent = Intent(activity, WelcomePage::class.java)
                    activity.startActivity(logoutIntent)
                    activity.finish()
                    Toast.makeText(activity, "Successfully logged out", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_exit -> {
                    showExitConfirmationDialog(activity)
                }
            }

            drawerLayout.closeDrawers()
            true
        }

        FirebaseUtils.getUserInfo(
            userId,
            { username, email ->
                userNameTextView.text = username
                emailTextView.text = email
            },
            { exception ->
                Log.e("FirebaseUtils", "Error retrieving user info: ${exception.message}")
            }
        )
    }

    private fun replaceFragment(activity: AppCompatActivity, fragment: Fragment) {
        val fragmentManager = activity.supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }

    private fun showExitConfirmationDialog(activity: AppCompatActivity) {
        val builder = AlertDialog.Builder(activity)
        builder.setTitle("Exit Confirmation")
        builder.setMessage("Are you sure you want to exit the app?")
        builder.setPositiveButton("Yes") { dialog, which ->
            activity.finishAffinity() // Exit the app
        }
        builder.setNegativeButton("No") { dialog, which ->
            dialog.dismiss() // Dismiss the dialog and do nothing
        }
        val dialog = builder.create()
        dialog.show()
    }

}
