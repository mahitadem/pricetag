package com.example.project

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class quickmart : AppCompatActivity() {
    lateinit var web3:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quickmart)
        web3=findViewById(R.id.web3)
        mrkt()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun mrkt(){
        web3.webViewClient= WebViewClient()
        web3.apply {
            loadUrl("https://quickmart.co.ke/")
            settings.javaScriptEnabled
            settings.safeBrowsingEnabled

        }
    }
    }
