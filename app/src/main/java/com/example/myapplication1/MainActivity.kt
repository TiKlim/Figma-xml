package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_login = findViewById<Button>(R.id.button)
        val btn_registration = findViewById<TextView>(R.id.registration)

        btn_login.setOnClickListener{ //Переход к окну входа
            val intent: Intent = Intent(this, SecondMainActivity::class.java)
            startActivity(intent)
        }

        btn_registration.setOnClickListener{ //Переход к регистрации
            val intent: Intent = Intent(this, ThirdMain::class.java)
            startActivity(intent)
        }
    }
}