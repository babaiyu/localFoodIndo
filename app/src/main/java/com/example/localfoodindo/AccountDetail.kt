package com.example.localfoodindo

import android.accounts.Account
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class AccountDetail : AppCompatActivity() {

    private var titleBar: String = "Account Profile"
    private var imgUrl: String = "https://avatars3.githubusercontent.com/u/41254174?v=4"
    private var myName: String = "Bayu Permana Putra"
    private var myEmail: String = "bayuputra9a@gmail.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_detail)

        //Set Action Bar Title
        setActionBarTitle(titleBar)
        setSupportActionBar(findViewById(R.id.my_toolbarAccount))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Get ID from layout
        val imgProfile: CircleImageView = findViewById(R.id.imgAccount)
        val titleProfile: TextView = findViewById(R.id.accountTitle)
        val emailProfile: TextView = findViewById(R.id.accountEmail)

        //Set Profile Data
        Glide.with(imgProfile)
            .load(imgUrl)
            .into(imgProfile) // Image Data
        titleProfile.text = myName // Full Name Data
        emailProfile.text = myEmail // Email Data

        emailProfile.setOnClickListener() {
            val openEmail = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$myEmail")
                putExtra(Intent.EXTRA_EMAIL, myEmail)
                putExtra(Intent.EXTRA_SUBJECT, "Hi Dicoding")
                putExtra(
                    Intent.EXTRA_TEXT,
                    """My name is $myName, i am so happy to learn Android Programming at Dicoding.
                        |I Hope to finish this course and continue to Expert Course.
                        |
                        |Please comment my first Android App by reply this email. Thank you Dicoding""".trimMargin()
                )
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(openEmail)
            }
        }
    }

    //Handle when Back Button Pressed ( at TopLeft Action Bar)
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    //Set Action Bar Title
    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }
}
