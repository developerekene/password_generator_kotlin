package com.example.passwordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var generatePassword = findViewById<Button>(R.id.Generate_password_button)
        var uniquePassword = findViewById<TextView>(R.id.layout_unique_password)
        val pass = "this is the password"

        generatePassword.setOnClickListener {
//            uniquePassword = pass
//            Functions().generatePassword()
            Toast.makeText(applicationContext, "Generate button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}