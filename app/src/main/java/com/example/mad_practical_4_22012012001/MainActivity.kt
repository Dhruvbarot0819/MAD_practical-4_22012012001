package com.example.mad_practical_4_22012012001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Login_buttton:Button=findViewById<Button>(R.id.login)
        var Signup_button:Button=findViewById<Button>(R.id.signup)

        Login_buttton.setOnClickListener {
            Intent(this@MainActivity,LoginActivity::class.java).also {
                startActivity(it)
            }
        }

        Signup_button.setOnClickListener {
            Intent(this@MainActivity,RegistractionActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}