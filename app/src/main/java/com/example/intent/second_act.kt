package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class second_act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val extras = intent.extras ?: return
        var isim = extras.getString("isim")

        var hosgeldiniz = findViewById<TextView>(R.id.hosgeldinizgoster)
        hosgeldiniz.text = "Hoşgeldiniz : " + isim


        var gecis = findViewById<Button>(R.id.button2)
        gecis.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

    }
}