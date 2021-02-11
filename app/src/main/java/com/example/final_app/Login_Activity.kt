package com.example.final_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth

private lateinit var loginemail : EditText
private lateinit var loginpassword: EditText
private lateinit var menuButton : Button
private lateinit var GoBackButton : Button
private lateinit var auth: FirebaseAuth

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_)

        loginemail = findViewById(R.id.LoginEmail)
        loginpassword = findViewById(R.id.LoginPassword)
        menuButton = findViewById(R.id.GoMenuButton)
        GoBackButton = findViewById(R.id.goBackButton)
        auth = FirebaseAuth.getInstance()


        supportActionBar?.hide()

        GoBackButton.setOnClickListener {
            finish()
        }

        menuButton.setOnClickListener {
            val email: String = loginemail.text.toString()
            val password: String = loginpassword.text.toString()

            if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "გთხოვთ შეასვოსთ ყველა გრაფა", Toast.LENGTH_LONG).show()
            } else{
                auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, OnCompleteListener { task ->
                    if(task.isSuccessful) {
                        Toast.makeText(this, "კეთილი იყოს თქვენი მობრძანება", Toast.LENGTH_LONG).show()
                        val intent = Intent(this, Menu_Activity::class.java)
                        startActivity(intent)
                        finish()
                    }
                })
            }

        }
    }
}