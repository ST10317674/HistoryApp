ST1037674 Report
Usage of the app
The program is intended for students, teachers, and everyone else who wants to learn about well-known figures who have influenced our world.

Overview of Features 
Users can search for a person based on their age.
Result function: It provides the person's name and age.
1	Marilyn Monroe - 36 - She was known for playing comic "blonde bombshell" characters and became one of the most popular sex symbols of the 1950s and early 1960s.


2	Abraham Lincoln - 56 – A US President also wrote poetry and has been called the country’s only poet president.
3	Pablo Escobar – 44 – He was considered the wealthiest criminal in history.
4	Martin Luther King – 39 – An American civil rights campaigner also He was instrumental in the passage of the Civil Rights Act of 1964 and the Voting Rights of 1965 

5	Muhamad Ali – 74- American Boxer and civil rights campaigner He was also well known for his clever rhymes and was named "Sportsman of the Century" by Sports Illustrated magazine in 1999.

6	Albert Einstein - 76- He received his federal teaching diploma in 1990 and later developed the theory of relativity. 

7	Joe Frazier – 67 -  Frazier was the undisputed heavyweight champion for three consecutive years from 1970-1973

8	Pablo Picasso – 91 – He was a child prodigy who finished his first painting at 9 years old and his father gave up art after seeing his son’s talents. 

9	 Kobe Bryantt- 41 – Kobe Bryant was named after one of the world's most famous and expensive type of beef

10.	 Akira Toriyama –68– He is a Japanese manga artist and character designer
 
Image Gallery: A picture featuring a historical photo.
 

I Made sure the biographical and historical facts were reliable and accurate, as errors might result in disinformation. Verifying the reliability of the information sources and making sure the information offered in the app is reliable and verifiable is known as source verification.
The difficulties I faced with making the application including the information needed as the results for entering the age of the person, and in doing so I was able to ensure that the app is visually appealing and has straightforward navigation and functioning while striking a balance between aesthetic appeal and utility. The Performance aims to provide a simple and seamless user experience across various devices and addressing the performance concerns such as poor loading times, UI latency, and memory usage.

Github Actions:
GitHub Actions is a tool for automating tasks offered by GitHub, which is the most significant platform for software development and version control using Git. GitHub Actions uses YAML-based configuration files to create workflows, which can be made up of one or more jobs that comprise a sequence of actions that can be done simultaneously.
The use of GitHub Actions provides various benefits to software development teams. primarily, it automates repetitive and lengthy operations, freeing developers to concentrate on developing code and delivering features.
It also supports continuous integration and deployment processes, allowing for the quick and dependable delivery of software updates and upgrades.









Conclusion
While creating this app it was interesting to use the GitHub action, which made it a little bit easier to view my code that was on Android Studio, and being able to include the voice-over and the screen recording was pretty educational and interesting to do.

Posting the Kotlin code to GitHub repositories made it effortless with the help of GitHub Actions. We as developers can automate the testing and deployment of their code, increase productivity, and optimize their development processes by creating custom workflows. Posting Kotlin code to GitHub repositories may be efficiently automated by developers using the procedures described in this paper. 

This will improve their workflow and speed up the production of high-caliber software. The relevance of GitHub Actions in contemporary software development methods is shown by real-world examples from organizations like Square, and JetBrains, and projects like Ktor, which show how widely used and efficient they are for sending Kotlin code to GitHub repositories.































Main Activity Code
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















Activity Main Code
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/background"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/history_theme"
    tools:context=".MainActivity">


    <TextView
        android:id="@+id/resultTextView"
        android:layout_width="347dp"
        android:layout_height="138dp"
        android:text="Info"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.938" />

    <Button
        android:id="@+id/clearButton"
        android:layout_width="100dp"
        android:layout_height="83dp"
        android:text="Clear"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.717"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.184" />

    <Button
        android:id="@+id/searchButton"
        android:layout_width="100dp"
        android:layout_height="83dp"
        android:text="Search"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.247"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.185" />

    <EditText
        android:id="@+id/ageInput"
        android:layout_width="183dp"
        android:layout_height="63dp"
        android:ems="10"
        android:hint="Enter Age"
        android:inputType="text"
        android:text=""
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.434"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.055" />

</androidx.constraintlayout.widget.ConstraintLayout>




















Reference
https://snp13.weebly.com/history.html
This website was used to find the people and theirs age small information about them:
www.biographyonline.net/people/famous-100.html















Bibliography
How to Write a Good README File for Your GitHub Project (freecodecamp.org)
Frontend Mentor | The benefits of writing a good challenge README
4 ways we use GitHub Actions to build GitHub - The GitHub Blog
What are GitHub Actions and How to Use Them | by Yann Mulonda | Bits and Pieces (bitsrc.io)
