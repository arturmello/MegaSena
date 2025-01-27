package com.example.megasena

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val editText = findViewById<EditText>(R.id.edit_number)
        val txtResult = findViewById<TextView>(R.id.txt_number)
        val txtRegister = findViewById<TextView>(R.id.txt_register)
        val btnGenerate = findViewById<Button>(R.id.btn_generate)

        //Preferências
        prefs = getSharedPreferences("db", Context.MODE_PRIVATE)
        val lastResult = prefs.getString("result", null)

        if (lastResult != null) {
            txtRegister.text = "Última aposta: $lastResult"
        }

        btnGenerate.setOnClickListener {

            val text = editText.text.toString()

            numberGenerator(text, txtResult)
        }
    }


    private fun numberGenerator(text: String, txtResult: TextView) {

        //Lógica de falha para caso o campo de texto, esteja vazio
        if (text.isEmpty()) {
            Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_LONG).show()
            return
        }

        //Lógica de falha para caso o número digitado não esteja entre 6 e 15
        val qtd = text.toInt() //Converte String para Inteiro

        if (qtd < 6 || qtd > 15) {
            Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_LONG).show()
            return
        }

        //Lógica de funcionamento de sucesso do app
        val numbers = mutableSetOf<Int>()
        val random = Random()

        while (true) {
            val number = random.nextInt(60) // Irá gerar números de 0 a 59
            numbers.add(number + 1)

            if (numbers.size == qtd) {
                break
            }
        }

        txtResult.text = numbers.joinToString(" - ")

        val editor = prefs.edit()
        editor.putString("result", txtResult.text.toString())
        editor.apply()

    }
}