package com.example.ftocconversionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var buttonConvert: Button
    private lateinit var textViewCelsius: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        buttonConvert = findViewById(R.id.button_convert)
        textViewCelsius = findViewById(R.id.textViewConvert)

        buttonConvert.setOnClickListener {
            if (!editText.text.toString().isEmpty()) {
                val result = (editText.text.toString().toDouble() + 32) / 1.8
                textViewCelsius.text = result.toString()
            } else {
                textViewCelsius.text = getString(R.string.enter_text)
            }
        }
    }


}