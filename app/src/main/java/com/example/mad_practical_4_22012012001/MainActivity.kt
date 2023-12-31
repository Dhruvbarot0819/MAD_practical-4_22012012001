package com.example.mad_practical_4_22012012001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn:Button = findViewById(R.id.loginButton)
        val registrationBtn:Button = findViewById(R.id.registrationButton)

        loginBtn.setOnClickListener {
            Intent(this@MainActivity, LoginActivity::class.java).also {
                startActivity(it)
            }
        }

        registrationBtn.setOnClickListener {
            Intent(this@MainActivity, RegistrationActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}