package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class signactivity : AppCompatActivity() {
    lateinit var reg: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signactivity)

        reg = findViewById(R.id.register)
        reg.setOnClickListener {
            val intent = Intent(this, cities::class.java)
            startActivity(intent)

        }
    }
}