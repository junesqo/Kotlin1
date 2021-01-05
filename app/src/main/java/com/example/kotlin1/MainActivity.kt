package com.example.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.id_event -> Toast.makeText(this, "Events", Toast.LENGTH_SHORT).show()
            R.id.id_profile -> Toast.makeText(this, "Your profile", Toast.LENGTH_SHORT).show()
            R.id.id_about -> Toast.makeText(this, "About us", Toast.LENGTH_SHORT).show()
        }

        return true
    }
}