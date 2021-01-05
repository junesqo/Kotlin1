package com.example.kotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nameList = ArrayList<String>()
        nameList.add("Иван")
        nameList.add("Степан")
        nameList.add("Константин")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
        listView.adapter = adapter
        listView.setOnItemClickListener{parent, view, position, id ->

            Toast.makeText(this, "Pressed item at position: ${nameList.get(position)}", Toast.LENGTH_SHORT).show()
        }
    }
}