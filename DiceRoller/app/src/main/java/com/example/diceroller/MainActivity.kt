package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

/**
 * Esta actividad permite al usuario lanzar el dado y ver el resultado
 * en la pantalla.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        //Hace un lanzamiento de dado cuando la aplicación se inicia
        rollDice()
    }

    /**
     * Lanza el dado y actualiza la pantalla con el resultado.
     */
    private fun rollDice() {
        // Crea un nuevo objeto de dado con 6 caras y lo lanza
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Encuentra la ImageView en el layout
        val diceImage: ImageView = findViewById(R.id.imageView)

        // Determina que drawable resourse ID usar basado en el lanzamiento del dado
        val drawableResource = when (diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Actualiza la ImageView con el correcto drawable resourse ID
        diceImage.setImageResource(drawableResource)

        // Actualiza la descripción del contenido
        diceImage.contentDescription = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}