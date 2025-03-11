package com.example.gasolinaoualcool

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var textInputAcool: TextInputLayout
    private lateinit var editAlcool: TextInputEditText

    private lateinit var textInputGasolina: TextInputLayout
    private lateinit var editGasolina: TextInputEditText

    private lateinit var btnCalcular: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initializeInterfaceComponents()
        btnCalcular.setOnClickListener {
            checkBestOption()
        }
    }

    private fun checkBestOption() {
        val alcoolPrice = editAlcool.text.toString()
        val gasolinaPrice = editGasolina.text.toString()

        val isEmpty = checkFields(alcoolPrice, gasolinaPrice)

        if (!isEmpty){
            val result = alcoolPrice.toDouble() / gasolinaPrice.toDouble()
            if (result >= 0.7) {
                textResultado.text = "Melhor abastecer com gasolina"
            } else {
                textResultado.text = "Melhor abastecer com álcool"
            }
        }
    }

    private fun checkFields(alcoolPrice: String, gasolinaPrice: String): Boolean {
        textInputAcool.error = null
        textInputGasolina.error = null

        if (alcoolPrice.isEmpty()) {
            textInputAcool.error = "Digite o preço do álcool"
            return true
        } else if (gasolinaPrice.isEmpty()) {
            textInputGasolina.error = "Digite o preço da gasolina"
            return true
        }
        return false
    }

    private fun initializeInterfaceComponents() {
        textInputAcool = findViewById(R.id.textInputAcool)
        editAlcool = findViewById(R.id.editAlcool)
        textInputGasolina = findViewById(R.id.textInputGasolina)
        editGasolina = findViewById(R.id.editGasolina)
        btnCalcular = findViewById(R.id.btnCalcular)
        textResultado = findViewById(R.id.textResultado)
    }
}