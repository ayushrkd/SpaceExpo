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

class question2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_question2)


        val option5but: Button = findViewById<Button>(R.id.option5button)
        val option6but: Button = findViewById<Button>(R.id.option6button)
        val option7but: Button = findViewById<Button>(R.id.option7button)
        val option8but: Button = findViewById<Button>(R.id.option8button)


//        correct answer  = 2


        option7but.setOnClickListener {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, question3::class.java)
            startActivity(intent)


        }

//        correct answer  = 2



        option6but.setOnClickListener {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()



        }
        option8but.setOnClickListener {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()



        }
        option5but.setOnClickListener {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()



        }
    }
}