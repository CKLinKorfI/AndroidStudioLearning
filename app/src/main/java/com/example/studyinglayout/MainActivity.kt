package com.example.studyinglayout

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.studyinglayout.databinding.ActivityLearnWordBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityLearnWordBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for ActivityLearnWordBinding must not be null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        _binding = ActivityLearnWordBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setContentView(R.layout.activity_learn_word)

        /*
        val tvQuestionWord: TextView = findViewById<TextView>(R.id.tvQuestionWord)

        //Переопределение свойства text объекта tvQuestionWord
        tvQuestionWord.text = "42"

        //Вызов метода сеттера изменения цвета, цвет из стандартной библ.
        tvQuestionWord.setTextColor(Color.RED)

        //Вызов метода сеттера изменения цвета, свой цвет в формате HEX
        tvQuestionWord.setTextColor(Color.parseColor("#FDD600"))
        */

        binding.tvFirstAnswer.text = "Android"
        binding.tvFirstAnswer.setTextColor(Color.GRAY)

        with(binding){
            tvSecondAnswer.setTextColor(Color.CYAN)
            tvThirdAnswer.setTextColor(Color.GREEN)
            tvFourthAnswer.setTextColor(Color.MAGENTA)
        }
    }
}