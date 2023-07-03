package com.example.project

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class naivas1 : AppCompatActivity() {
    lateinit var web:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naivas1)
        web=findViewById(R.id.webview)
        mrkt()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun mrkt(){
        web.webViewClient=WebViewClient()
        web.apply {
            loadUrl("https://naivas.online/")
            settings.javaScriptEnabled
            settings.safeBrowsingEnabled

        }
    }
}