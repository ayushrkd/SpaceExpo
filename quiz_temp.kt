package com.example.spaceexpo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class quiz_temp : AppCompatActivity() {

    private lateinit var questionText: TextView
    private lateinit var option1Button: Button
    private lateinit var option2Button: Button
    private lateinit var option3Button: Button
    private lateinit var option4Button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_temp)

        // Bind views to layout components
        questionText = findViewById(R.id.question_text)
        option1Button = findViewById(R.id.option1_button)
        option2Button = findViewById(R.id.option2_button)
        option3Button = findViewById(R.id.option3_button)
        option4Button = findViewById(R.id.option4_button)

//        correct answer  = 2


        option2Button.setOnClickListener {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, question2::class.java)
            startActivity(intent)


        }
        option1Button.setOnClickListener {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()



        }
        option3Button.setOnClickListener {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()



        }
        option4Button.setOnClickListener {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()



        }
    }

}








