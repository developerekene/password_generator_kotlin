package com.example.passwordgenerator

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Getting the button view
        var generatePassword = findViewById<Button>(R.id.Generate_password_button)
        var clearField = findViewById<Button>(R.id.clear_field_button)
        var copyText = findViewById<Button>(R.id.copy_text_button)

        //Getting the Text view
        var uniquePassword = findViewById<TextView>(R.id.layout_unique_password)
        var revertBack = "YOUR UNIQUE PASSWORD GOES HERE"


        //onclick listener for generate password button
        generatePassword.setOnClickListener {
            uniquePassword.text = Functions().generatePassword()
//            Log.d("AAAAAA", "${Functions().generatePassword()}")
            Toast.makeText(applicationContext, "Password Generated Successfully", Toast.LENGTH_SHORT).show()
        }

        //onclick listener for clear field button
        clearField.setOnClickListener {
            uniquePassword.text = revertBack
            Toast.makeText(applicationContext, "Password Cleared Successfully", Toast.LENGTH_SHORT).show()

        }


        //onclick listener for copy text button
        copyText.setOnClickListener {

            if (uniquePassword.text == revertBack){
                Toast.makeText(this, "Please generate password first", Toast.LENGTH_SHORT).show()
            }else{
                val textToCopy = uniquePassword.text
                val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clipData = ClipData.newPlainText("text", textToCopy)
                clipboardManager.setPrimaryClip(clipData)
                Toast.makeText(this, "Password copied to clipboard", Toast.LENGTH_SHORT).show()
            }

        }


    }
}