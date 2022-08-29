package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val altura = findViewById<EditText>(R.id.laltura)
        val peso = findViewById<EditText>(R.id.lpeso)
        val imc = findViewById<EditText>(R.id.imxtext)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener { if(altura.text.isEmpty() || peso.text.isEmpty()){
            imc.setText("insira o valor")
        }
            else {
                var alt = altura.text.toString().toDouble()
                var pes = peso.text.toString().toDouble()
                var result: Double? = null

            if(alt>10){
                result = pes/((alt/100)*(alt/100))
                if (result < 18.5){
                    imc.setText("Seu imc é de " + String.format("%.2f", result) + " Abaixo do peso")
                }
                if (result >18.5 && result<25){
                    imc.setText("Seu imc é de " + String.format("%.2f", result) + " Peso ideal")
                }
                if (result >25 && result < 30){
                    imc.setText("Seu imc é de " + String.format("%.2f", result) + " Sobrepeso")
                }
                if (result >30){
                    imc.setText("Seu imc é de " + String.format("%.2f", result) + " Obesidade ")
                }
            }
            else if(alt<10){
                result = pes/(alt*alt)
                if (result < 18.5){
                    imc.setText("Seu imc é de " + String.format("%.2f", result) + " Abaixo do peso")
                }
                if (result >18.5 && result<25){
                    imc.setText("Seu imc é de " + String.format("%.2f", result) + " Peso ideal")
                }
                if (result >25 && result < 30){
                    imc.setText("Seu imc é de " + String.format("%.2f", result) + " Sobrepeso")
                }
                if (result >30){
                    imc.setText("Seu imc é de " + String.format("%.2f", result) + " Obesidade ")
                }
            }

        }

        }
    }
}