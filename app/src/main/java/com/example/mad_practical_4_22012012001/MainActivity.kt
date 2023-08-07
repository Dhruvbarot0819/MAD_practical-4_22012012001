package com.example.mad_practical_4_22012012001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Login_buttton=findViewById<Button>(R.id.button3)
        var Signup_button=findViewById<Button>(R.id.button4)
    }
}