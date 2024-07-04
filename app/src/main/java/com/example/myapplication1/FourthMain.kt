package com.example.myapplication1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FourthMain : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.fourth_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_sidemenu = findViewById<ImageView?>(R.id.sidemenu) //инициализация кнопок
        val btn_profile = findViewById<ImageView?>(R.id.profile)
        val btn_profilepic = findViewById<ImageView>(R.id.userprofil)
        val btn_sounds = findViewById<ImageView?>(R.id.sounds);


        btn_sidemenu.setOnClickListener {//переход в меню
            val intent: Intent = Intent(this, FifthMain::class.java)
            startActivity(intent)
        }

        btn_profile.setOnClickListener{//Переход в профиль
            val intent: Intent = Intent(this, EigthMain::class.java)
            startActivity(intent)
        }
        btn_profilepic.setOnClickListener{//Переход в профиль
            val intent: Intent = Intent(this, EigthMain::class.java)
            startActivity(intent)
        }

        btn_sounds.setOnClickListener {//переход к аудиозаписям
            val intent: Intent = Intent(this, SeventhMain::class.java)
            startActivity(intent)
        }
    }

}