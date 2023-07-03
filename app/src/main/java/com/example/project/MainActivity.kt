package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var log:Button
    lateinit var Sign:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log=findViewById(R.id.login)
        Sign=findViewById(R.id.sign)

        log.setOnClickListener {
            val intent=Intent(this,login2::class.java)
            startActivity(intent)
        }
        Sign.setOnClickListener {
            val intent=Intent(this,signactivity::class.java)
            startActivity(intent)
        }
    }
}