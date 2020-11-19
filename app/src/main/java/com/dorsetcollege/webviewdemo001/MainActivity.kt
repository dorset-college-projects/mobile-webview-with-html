package com.dorsetcollege.webviewdemo001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.webViewClient = WebViewClient()

       // webView.loadUrl("https://mfusionsandyford.com/")

        webView.loadUrl("file:///android_res/raw/index.html");


        webView.settings.javaScriptEnabled = true

        webView.settings.javaScriptCanOpenWindowsAutomatically = false;

        webView.settings.setSupportZoom(true)




    }

    override fun onBackPressed() {

        if (webView.canGoBack()) {
            webView.goBack()

        } else
            super.onBackPressed()
    }
}