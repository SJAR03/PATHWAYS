package ni.edu.uca.registrousuarios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val codigo = findViewById<EditText>(R.id.editText_codigo)
        val nombres = findViewById<EditText>(R.id.editText_nombre)
        val apellidos = findViewById<EditText>(R.id.editText_apellido)
        val cargo = findViewById<EditText>(R.id.editText_cargo)
        val fecha_nac = findViewById<EditText>(R.id.editText_fecha_nac)
        val foto = findViewById<ImageView>(R.id.foto)
        val seleccionar_foto = findViewById<Button>(R.id.boton_foto)
        val registrar = findViewById<Button>(R.id.boton_registrar)

        registrar.setOnClickListener {

        }

        val camara = findViewById<Button>(R.id.boton_foto)
        val inicio = findViewById<Button>(R.id.volver)


        camara.setOnClickListener {
            val irACamara = Intent (this, Camara::class.java)
            startActivity(irACamara)
        }

        inicio.setOnClickListener {
            val intento1 = Intent (this, MainActivity::class.java)
            startActivity(intento1)
        }
    }
}