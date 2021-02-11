package com.example.final_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var gamonatqvamebi : Button
private lateinit var rchevebi: Button

class Menu_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_)


        supportActionBar?.hide()

        gamonatqvamebi = findViewById(R.id.GamonatqvamebiButton)
        rchevebi = findViewById(R.id.RchevebiButton)


    gamonatqvamebi.setOnClickListener {
        val intent = Intent(this,Gamonatqvamebi_Activity::class.java)
        startActivity(intent)
    }

        rchevebi.setOnClickListener {
            val intent = Intent(this,Rchevebi_ListView::class.java)
            startActivity(intent)
        }
    }
}