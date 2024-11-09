package com.example.spaceexpo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.spaceexpo.databinding.ActivityMainBinding

class main_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_menu)




        val btn = findViewById<Button>(R.id.startgame)
        val btn2 = findViewById<Button>(R.id.galaxybtn)

        btn.setOnClickListener{

            val intent = Intent(this,start_level::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener{
            val intent = Intent(this , galaxy::class.java)
            startActivity(intent)


        }



    }
}