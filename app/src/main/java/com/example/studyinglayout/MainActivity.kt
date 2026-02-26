package com.example.studyinglayout

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_learn_word)

        val tvQuestionWord: TextView = findViewById<TextView>(R.id.tvQuestionWord)

        //Переопределение свойства text объекта tvQuestionWord
        tvQuestionWord.text = "42"

        //Вызов метода сеттера изменения цвета, цвет из стандартной библ.
        tvQuestionWord.setTextColor(Color.RED)

        //Вызов метода сеттера изменения цвета, свой цвет в формате HEX
        tvQuestionWord.setTextColor(Color.parseColor("#FDD600"))



    }
}