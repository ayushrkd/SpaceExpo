package com.example.spaceexpo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class question_bank : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_bank)


        fun QuestionBank(): List<Question> {
            return listOf(
                Question(1, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Venus", 2),
                Question(2, "How many moons does Jupiter have?", "53", "69", "79", "92", 3),
                Question(3, "What is the largest planet in our solar system?", "Earth", "Saturn", "Jupiter", "Mars", 3),
                Question(4, "Which planet is known as the 'Blue Planet'?", "Venus", "Earth", "Neptune", "Uranus", 2),
                Question(5, "What is the smallest planet in our solar system?", "Mercury", "Mars", "Venus", "Pluto", 1)
                // Add more questions as needed
            )
        }

    }

    operator fun get(i: Int): Any {
                TODO("Not yet implemented")
    }


}

class Question(i: Int, s: String, s1: String, s2: String, s3: String, s4: String, i1: Int) {

}
