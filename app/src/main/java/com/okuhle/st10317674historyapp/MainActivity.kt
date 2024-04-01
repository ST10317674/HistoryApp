package com.okuhle.st10317674historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttonGenerate: Button
    private lateinit var buttonClear: Button
    private lateinit var editTextAge: EditText
    private lateinit var editTextInfo: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextAge = findViewById(R.id.editTextAge)
        buttonClear = findViewById(R.id.button2)
        buttonGenerate = findViewById(R.id.button)
        editTextInfo = findViewById(R.id.editTextInfo)

        buttonGenerate.setOnClickListener {
            val name = editTextAge.text.toString().trim()
            val ageStr = editTextInfo.text.toString().trim()

            if (name.isEmpty() || ageStr.isEmpty()) {
                Toast.makeText(this, "Please enter the age number", Toast.LENGTH_LONG).show()
                Log.e("Message Log", "User did not enter the correct number")
            }else {
                val ageStr = ageStr.toIntOrNull()
                if (ageStr == null || ageStr  < 0) {
                    Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show()
                }else{
                    Log.d("Enter Age: $age")
                    Log.d("MainActivity : $ageStr")
                    Toast.makeText(this,"The correct Age has been successfully logged", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}