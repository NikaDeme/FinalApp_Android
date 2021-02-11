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
import com.google.firebase.auth.UserProfileChangeRequest

private lateinit var Email : EditText
private lateinit var Password: EditText
private lateinit var Register_Button: Button
private lateinit var Login_Button: Button
private lateinit var auth: FirebaseAuth

class Registration_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_)

        supportActionBar?.hide()
        Email = findViewById(R.id.RegEditText)
        Password = findViewById(R.id.PassEditText)
        Register_Button = findViewById(R.id.regButton)
        Login_Button = findViewById(R.id.loginButton)
        auth = FirebaseAuth.getInstance()


    Login_Button.setOnClickListener {
        val intent = Intent (this, Login_Activity::class.java)
        startActivity(intent)
    }

    Register_Button.setOnClickListener {
        val email: String = Email.text.toString()
        val password: String = Password.text.toString()

        if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "გთხოვთ შეავსოთ გრაფები", Toast.LENGTH_LONG).show()
        } else{
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(
                    this,
                    OnCompleteListener { task ->
                        if (task.isSuccessful) {
                            val user = auth.currentUser;
                            val profileUpdates = UserProfileChangeRequest.Builder()
                                    .setDisplayName(email).build()

                            user?.updateProfile(profileUpdates)
                                    ?.addOnCompleteListener(OnCompleteListener<Void?> { userUpdated ->
                                        if (userUpdated.isSuccessful) {
                                            Toast.makeText(this, "თქვენ წარმატებით დარეგისტრირდით", Toast.LENGTH_LONG)
                                                    .show()
                                            val intent = Intent(this, Login_Activity::class.java)
                                            startActivity(intent)
                                            finish()
                                        }
                                    })
                        }
                    })
        }

    }



    }
}