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

class signactivity : AppCompatActivity() {
    lateinit var reg: Button
    lateinit var nam: EditText
    lateinit var pas: EditText
    lateinit var con: EditText
    lateinit var em: EditText
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signactivity)
        reg = findViewById(R.id.register)

        nam = findViewById(R.id.name)
        pas = findViewById(R.id.password)
        con = findViewById(R.id.confirm)
        em = findViewById(R.id.email)
        auth = Firebase.auth

//        reg.setOnClickListener {
//            val intent = Intent(this, cities::class.java)
//            startActivity(intent)

        reg.setOnClickListener {
            signuser()
        }
    }

        private fun signuser() {
        val mail = em.toString()
        val password = pas.toString()

        if (mail.isBlank() || password.isBlank()) {
            Toast.makeText(this, "Password and Email can't be blank", Toast.LENGTH_LONG).show()
            return
        } else if (pas!=con){
            Toast.makeText(this,"Password does not match",Toast.LENGTH_LONG).show()
        }
            auth.createUserWithEmailAndPassword(mail,password).addOnCompleteListener(this){
                if(it.isSuccessful){
                    Toast.makeText(this,"Signed up successfully",Toast.LENGTH_LONG).show()
                    finish()
                }else {
                    Toast.makeText(this,"Fail to create user",Toast.LENGTH_LONG).show()
                }
            }


    }
}
