package com.example.passwordgenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)

        var idButton = findViewById<Button>(R.id.Unique_ID_button)
        var passButton = findViewById<Button>(R.id.Unique_Password_button)

        passButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        idButton.setOnClickListener {
            var intent = Intent(this, IdActivity::class.java)
            startActivity(intent)
        }
    }
}