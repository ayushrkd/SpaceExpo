package com.example.spaceexpo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class start_level : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_start_level)


        val btn2 = findViewById<Button>(R.id.startgame)

        btn2.setOnClickListener{
            val intent = Intent(this,quiz_temp::class.java)
            startActivity(intent)
        }


    }

}