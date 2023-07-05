package com.example.project

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class carrfour : AppCompatActivity() {
    lateinit var car:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrfour)

        car=findViewById(R.id.carrfour)
        webview()

    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webview(){
        car.webViewClient= WebViewClient()
        car.apply {
            loadUrl("https://www.carrefour.ke/mafken/en/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (car.canGoBack())car.goBack()else
        super.onBackPressed()
    }
    }

