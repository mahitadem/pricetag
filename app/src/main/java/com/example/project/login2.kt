package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class login2 : AppCompatActivity() {
    lateinit var log2: Button
    lateinit var nam:EditText
    lateinit var pas:EditText
    lateinit var mail:EditText
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        log2 = findViewById(R.id.login)

        nam = findViewById(R.id.editTextText)
        pas = findViewById(R.id.pass)
        mail = findViewById(R.id.mail2)
        auth = FirebaseAuth.getInstance()


//        log2.setOnClickListener {
//            val intent = Intent(this, cities::class.java)
//            startActivity(intent)
//
//        }

        log2.setOnClickListener {
            loginuser()
        }
    }

        private fun loginuser () {
            val email = mail.toString()
            val pass = pas.toString()
            auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
                if(it.isSuccessful){
                    Toast.makeText(this,"Successfully signed in",Toast.LENGTH_LONG).show()
                    finish()
                }else{
                    Toast.makeText(this,"Sign in failed",Toast.LENGTH_LONG).show()
                }
            }
        }
    }
