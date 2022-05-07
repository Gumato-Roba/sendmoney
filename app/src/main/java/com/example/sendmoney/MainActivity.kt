package com.example.sendmoney

import android.content.Intent
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnSend: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSend = findViewById(R.id.btnSend)
        btnSend.setOnClickListener {
            var intent = Intent(this,Money::class.java)
            startActivity(intent)
        }
    }
}