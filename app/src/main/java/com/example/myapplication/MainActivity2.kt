package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.ContactsContract
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val openContactsButton = findViewById<Button>(R.id.buttonContact)
        openContactsButton.setOnClickListener {
            val phoneNumber = "8944914504"
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$phoneNumber")
            }
            startActivity(intent)
        }

        val webbtn1=findViewById<CardView>(R.id.Android)
        webbtn1.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.android.com/docs")
            startActivity(intent)
        }

        val webbtn2=findViewById<CardView>(R.id.DSA)
        webbtn2.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/data-structures/")
            startActivity(intent)
        }

        val webbtn3=findViewById<CardView>(R.id.IOS)
        webbtn3.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.apple.com/programs/?utm_source=chatgpt.com")
            startActivity(intent)
        }
        val webbtn4=findViewById<CardView>(R.id.Web)
        webbtn4.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.mozilla.org/en-US/docs/Learn_web_development?utm_source=chatgpt.com")
            startActivity(intent)
        }
        val webbtn5=findViewById<CardView>(R.id.MI)
        webbtn5.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developers.google.com/machine-learning/crash-course?utm_source=chatgpt.com")
            startActivity(intent)
        }
        val webbtn6=findViewById<CardView>(R.id.BlockChain)
        webbtn6.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.ibm.com/technologies/blockchain/tutorials/blockchain101-intro-bluemix-trs/")
            startActivity(intent)
        }

    }
}