package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class cities : AppCompatActivity() {
    lateinit var mkts:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cities)

        val cty=findViewById<ListView>(R.id.city)
        val mrk= arrayOf("Nairobi","Kiambu","Muranga","Mombasa","Nyeri","Kiambu","Nakuru")
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,mrk)
        cty.adapter=arrayAdapter

        cty.setOnItemClickListener { adapterView, view, position, l ->
//            Toast.makeText(this,"You have clicked on"+ mrk(position), Toast.LENGTH_LONG).show()

            mkts=findViewById(R.id.city)
            val intent= Intent(this,loginactivity::class.java)
            startActivity(intent)
        }
//        mkts=findViewById(R.id.city)
     
    }

    private fun mrk(position: Int) {

    }
    }
