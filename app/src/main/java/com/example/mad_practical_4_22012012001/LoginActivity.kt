package com.example.mad_practical_4_22012012001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUpTxt: TextView = findViewById(R.id.signUpText)
        val loginButton: Button = findViewById(R.id.loginButton)

        signUpTxt.setOnClickListener {
            Intent(this@LoginActivity, RegistrationActivity::class.java).also {
                startActivity(it)
            }
        }

        loginButton.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Login Successfully", Toast.LENGTH_LONG).show()
        }
    }
}