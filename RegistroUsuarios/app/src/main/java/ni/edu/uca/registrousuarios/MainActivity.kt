package ni.edu.uca.registrousuarios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registro = findViewById<Button>(R.id.botonregistrar)
        val buscar = findViewById<Button>(R.id.botonbuscar)

        registro.setOnClickListener {
            val intento1 = Intent (this, Registro::class.java)
            startActivity(intento1)
        }

        buscar.setOnClickListener {
            val intento2 = Intent (this, Buscar::class.java)
            startActivity(intento2)
        }
    }
}