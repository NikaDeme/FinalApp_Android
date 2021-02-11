package com.example.final_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var OnClickIlia: Button
private lateinit var OnClickVaja: Button
private lateinit var OnClickBackRchevebi : Button

class Gamonatqvamebi_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gamonatqvamebi_)

        OnClickBackRchevebi = findViewById(R.id.GoBackRchevebi)
        OnClickIlia = findViewById(R.id.iliaButton)
        OnClickVaja = findViewById(R.id.VajaButton)

        supportActionBar?.hide()

    OnClickIlia.setOnClickListener {
        val intent =  Intent(this,IliaListview::class.java)
        startActivity(intent)
    }

        OnClickVaja.setOnClickListener {
        val intent = Intent(this,VajaListView::class.java)
            startActivity(intent)
        }


        OnClickBackRchevebi.setOnClickListener {
            val intent = Intent(this,Menu_Activity::class.java)
            startActivity(intent)
        }
    }
}