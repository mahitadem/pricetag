package com.example.project

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class carrfour : AppCompatActivity() {
    lateinit var web2:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrfour)
        web2=findViewById(R.id.web2)
        mrkt()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun mrkt(){
        web2.webViewClient= WebViewClient()
        web2.apply {
            loadUrl("https://www.carrefour.ke/mafken/en/")
            settings.javaScriptEnabled
            settings.safeBrowsingEnabled

        }
    }
    }
