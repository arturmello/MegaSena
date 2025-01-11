package com.example.megasena

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editText = findViewById<EditText>(R.id.edit_number)
        val txtResult = findViewById<TextView>(R.id.txt_number)
        val btnGenerate = findViewById<Button>(R.id.btn_generate)

        btnGenerate.setOnClickListener {

            val text = editText.text.toString()

            numberGenerator(text, txtResult)
        }
    }

    private fun numberGenerator(text: String, txtResult: TextView) {
        //Validar quando o campo é vazio
        if(text.isNotEmpty()) {

            // Convertendo a String em Inteiro
            val qtd = text.toInt()

            //Validar se o usuário digitou um número entre 6 e 15
            if (qtd >= 6 && qtd <= 15) {

                val numbers = mutableSetOf<Int>()
                val random = Random()

                while(true) {
                    val number = random.nextInt(60) // Irá gerar números de 0 a 59
                    numbers.add(number + 1)

                    if (numbers.size == qtd) {
                        break
                    }
                }

                txtResult.text = numbers.joinToString(" - ")

            } else {
                Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_LONG).show()
            }

        } else {
            Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_LONG).show()
        }
    }
}