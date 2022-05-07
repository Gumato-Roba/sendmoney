package com.example.sendmoney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Money : AppCompatActivity() {
    lateinit var btnCancel: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_money)
        btnCancel = findViewById(R.id.btnCancel)
        btnCancel.setOnClickListener {
            var intent = Intent(this,btnCancel::class.java)
            startActivity(intent)
        }
    }
}