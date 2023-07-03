package com.example.project

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class cleanshelf : AppCompatActivity() {
    lateinit var web4:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cleanshelf)
        web4=findViewById(R.id.web4)
        mrkt()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun mrkt(){
        web4.webViewClient= WebViewClient()
        web4.apply {
            loadUrl("https://quickmart.co.ke/")
            settings.javaScriptEnabled
            settings.safeBrowsingEnabled

        }
    }
}