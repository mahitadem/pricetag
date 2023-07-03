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
    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var pass: EditText
    lateinit var btn: Button
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        log2 = findViewById(R.id.login)

        log2.setOnClickListener {
            val intent = Intent(this, cities::class.java)
            startActivity(intent)
            name = findViewById(R.id.editTextText)
            email = findViewById(R.id.mail2)
            pass = findViewById(R.id.pass)
            btn = findViewById(R.id.login)
            auth = Firebase.auth


            name.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            btn.setOnClickListener {
                loginactivity()

            }
            fun loginactivity() {
                val email = email.text.toString()
                val pass = pass.text.toString()
//                val conf = con.text.toString()

                if (email.isBlank() || pass.isBlank()) {
                    Toast.makeText(this, "Password and email can't be blank", Toast.LENGTH_LONG)
                        .show()
                    return

//                } else if (pass != conf) {
//                    Toast.makeText(this, "Password does not match", Toast.LENGTH_LONG).show()}
//
                }
                auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {

                    if (it.isSuccessful) {
                        Toast.makeText(this, "Signed up successfully", Toast.LENGTH_LONG).show()
                        finish()


                    } else {
                        Toast.makeText(this, "Fail to create user", Toast.LENGTH_LONG).show()
                    }

                }

            }

        }
    }
}