package com.okuhle.st10317674historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView:TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton:Button






    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        searchButton= findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)

        searchButton.setOnClickListener{
//create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

//if age is not null and age is in the range between
            if (age != null && age in 20 .. 100) {
//when age is 30 display Thato else when is .. and so on
                val famousfiguresName = when (age) {
                    36 -> "Marilyn Monroe" +
                            "She was known for playing comic \"blonde bombshell\" characters and became one of the most popular sex symbols of the 1950s and early 1960s"
                    56 -> "Abraham Lincoln" +
                            "A US President also wrote poetry and has been called the country’s only poet president."
                    39 -> "Martin Luther King" +
                            "An American civil rights campaigner also He was instrumental in the passage of the Civil Rights Act of 1964 and the Voting Rights of 1965 "
                    41 -> "Kobe Bryant" +
                            "Kobe Bryant was named after one of the world's most famous and expensive type of beef"
                    67 -> "Joe Frazier" +
                            "He was the undisputed heavyweight champion for three consecutive years from 1970-1973"
                    76 -> "Albert Einstein " +
                            "He received his federal teaching diploma in 1990 and later developed the theory of relativity. "
                    44 -> "Pablo Escobar" +
                            "He was considered the wealthiest criminal in history."
                    68 -> "Akira Toriyama " +
                            "He is a Japanese manga artist and character designer"
                    91 -> "Pablo Picasso" +
                            "He was a child prodigy who finished his first painting at 9 years old and his father gave up art after seeing his son’s talents. "
                    74 -> "Muhamad Ali" +
                            "American Boxer and civil rights campaigner He was also well known for his clever rhymes and was named \"Sportsman of the Century\" by Sports Illustrated magazine in 1999."
                    else -> null
                }
                val message = if (famousfiguresName != null) " The celebrity's name is $famousfiguresName."
                else "No famous figure found with the entered age."
                resultTextView.text = message
            } else{
                resultTextView.text = "Invalid input. Please enter a valid age between 20 and 100."

            }
        }

        clearButton.setOnClickListener{
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }
}