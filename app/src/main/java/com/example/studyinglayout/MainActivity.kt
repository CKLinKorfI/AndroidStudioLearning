package com.example.studyinglayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
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

        // Нейтральный ответ
        binding.btnContinue.setOnClickListener {
            markAnswerNeutral()
        }
        // Корректный ответ
        binding.layoutAnswer3.setOnClickListener {
            markAnswerCorrect()
        }
        // Некорректный ответ
        binding.layoutAnswer1.setOnClickListener {
            markAnswerWrong()
        }
    }

    private fun markAnswerCorrect() {
        binding.layoutAnswer3.background = ContextCompat.getDrawable(
            this@MainActivity,
            R.drawable.shape_rounded_containers_correct
        )

        with(binding.tvVariantNumber3) {
            background =  ContextCompat.getDrawable(
                this@MainActivity,
                R.drawable.shape_rounded_variants_correct
            )
            setTextColor(ContextCompat.getColor(
                this@MainActivity,
                R.color.white
            ))
        }

        binding.tvVariantValue3.setTextColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.correctAnswerColor
            )
        )

        binding.btnSkip.isVisible = false

        binding.layoutResult.setBackgroundColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.correctAnswerColor
            )
        )

        binding.ivResultIcon.setImageDrawable(
            ContextCompat.getDrawable(
                this@MainActivity,
                R.drawable.ic_correct
            )
        )

        binding.tvResultMessage.text = resources.getString(R.string.correct_answer)

        binding.btnContinue.setTextColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.correctAnswerColor
            )
        )

        binding.layoutResult.isVisible = true
    }

    private fun markAnswerWrong(){
        binding.layoutAnswer1.background = ContextCompat.getDrawable(
            this@MainActivity,
            R.drawable.shape_rounded_containers_wrong
        )

        with(binding.tvVariantNumber1) {
            background =  ContextCompat.getDrawable(
                this@MainActivity,
                R.drawable.shape_rounded_variants_wrong
            )
            setTextColor(ContextCompat.getColor(
                this@MainActivity,
                R.color.white
            ))
        }

        binding.tvVariantValue1.setTextColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.wrongAnswerColor
            )
        )

        binding.btnSkip.isVisible = false

        binding.layoutResult.setBackgroundColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.wrongAnswerColor
            )
        )

        binding.ivResultIcon.setImageDrawable(
            ContextCompat.getDrawable(
                this@MainActivity,
                R.drawable.ic_wrong
            )
        )

        binding.tvResultMessage.text = resources.getString(R.string.wrong_text)

        binding.btnContinue.setTextColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.wrongAnswerColor
            )
        )

        binding.layoutResult.isVisible = true
    }

    private  fun  markAnswerNeutral() {
        with(binding) {
            for (layout in listOf(layoutAnswer1, layoutAnswer3)) {
                layout.background = ContextCompat.getDrawable(
                    this@MainActivity,
                    R.drawable.shape_rounded_containers
                )
            }

            for (tv in listOf(tvVariantValue1, tvVariantValue3)) {
                tv.setTextColor(
                    ContextCompat.getColor(
                        this@MainActivity,
                        R.color.textVariantsColor
                    )
                )
            }

            for (tv in listOf(tvVariantNumber1, tvVariantNumber3)) {

                tv.apply {
                    setTextColor(
                        ContextCompat.getColor(
                            this@MainActivity,
                            R.color.textVariantsColor
                        )
                    )

                    background = ContextCompat.getDrawable(
                        this@MainActivity,
                        R.drawable.shape_rounded_variants
                    )
                }
            }


            layoutResult.isVisible = false
            btnSkip.isVisible = true
        }
    }
}