package com.example.spaceexpo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.spaceexpo.databinding.ActivityMainBinding


lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)


        Handler().postDelayed({
            val intent = Intent(this,main_menu::class.java)
            startActivity(intent)
        },3000)
        // finish()


       // binding.spaceexpo.setOnClickListener{

       //  }

















    }
}