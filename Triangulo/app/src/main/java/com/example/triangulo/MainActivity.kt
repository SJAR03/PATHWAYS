package com.example.triangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.equilatero)
        rollButton.setOnClickListener { rollTriaungulo() }
        val rollButton1: Button = findViewById(R.id.isósceles)
        rollButton1.setOnClickListener { rollTriaungulo() }
        val rollButton2: Button = findViewById(R.id.escaleno)
        rollButton2.setOnClickListener { rollTriaungulo() }

        rollTriaungulo()
    }

    private fun rollTriaungulo() {

        val dice = Dice(3)
        val diceTriangulo = dice.roll()

        val diceImage: ImageView = findViewById(R.id.imageView)

        val drawableResource = when (diceTriangulo){
            1 -> R.drawable.images1
            2 -> R.drawable.images2
            else -> R.drawable.images3
        }

        diceImage.setImageResource(drawableResource)

        diceImage.contentDescription = diceTriangulo.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

