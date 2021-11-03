package ni.edu.uca.registrousuarios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Buscar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar)

        val inicio = findViewById<Button>(R.id.volver)

        inicio.setOnClickListener {
            val intento1 = Intent (this, MainActivity::class.java)
            startActivity(intento1)
        }
    }
}