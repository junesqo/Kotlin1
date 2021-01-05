package com.example.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickStart(view:View){
        val intent = Intent(this, SecondActivity::class.java).apply{
            putExtra("salud", "Hello from main activity")
        }
        startActivity(intent)
    }

}