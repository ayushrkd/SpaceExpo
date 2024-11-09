package com.example.spaceexpo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class question3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_question3)

        val option9but: Button = findViewById<Button>(R.id.option9_button)
        val option10but: Button = findViewById<Button>(R.id.option10_button)
        val option11but: Button = findViewById<Button>(R.id.option11_button)
        val option12but: Button = findViewById<Button>(R.id.option12_button)

//        correct answer  = 2


        option11but.setOnClickListener {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, correct_ans::class.java)
            startActivity(intent)


        }
        option9but.setOnClickListener {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()



        }
        option10but.setOnClickListener {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()



        }
        option12but.setOnClickListener {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()



        }

    }
}