package com.example.myapplication1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EigthMain : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.eighth_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val btn_sidemenu = findViewById<ImageView>(R.id.sidemenu) //инициализация кнопок
        val btn_sounds = findViewById<ImageView>(R.id.sounds);
        val btn_home = findViewById<ImageView>(R.id.home);
        val btn_forest = findViewById<ImageView>(R.id.imageForest)
        val btn_exit = findViewById<TextView>(R.id.exit)

        btn_sidemenu.setOnClickListener { //переход в меню
            val intent: Intent = Intent(this, FifthMain::class.java)
            startActivity(intent)
        }

        btn_sounds.setOnClickListener { //переход к аудиозаписям
            val intent: Intent = Intent(this, SeventhMain::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener { //переход к аудиозаписям
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn_forest.setOnClickListener { //переход к фото
            val intent: Intent = Intent(this, SixthMain::class.java)
            startActivity(intent)
        }

        btn_exit.setOnClickListener{ //Переход к онбордингу (к адаптации? самое начало крч)
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}