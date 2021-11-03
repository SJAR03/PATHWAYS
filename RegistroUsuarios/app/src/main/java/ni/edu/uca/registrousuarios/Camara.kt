package ni.edu.uca.registrousuarios

import android.content.Intent
import android.graphics.Bitmap
import android.media.MediaScannerConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import ni.edu.uca.registrousuarios.R
import ni.edu.uca.registrousuarios.Registro
import ni.edu.uca.registrousuarios.databinding.ActivityCamaraBinding
import java.io.File
import java.io.FileOutputStream
import kotlin.random.Random

class Camara : AppCompatActivity() {
    private lateinit var binding: ActivityCamaraBinding
    val REQUEST_IMAGE_CAPTURE = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCamaraBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.volver.setOnClickListener(){
            volverRegistro()
        }

        binding.tomarFoto.setOnClickListener(){
            abrirCamara()
        }

        val registro = findViewById<Button>(R.id.volver)

        registro.setOnClickListener {
            val intento1 = Intent (this, Registro::class.java)
            startActivity(intento1)
        }

    }

    private fun volverRegistro(){
        val intento1 = Intent (this, Registro::class.java)
        startActivity(intento1)
    }

    fun abrirCamara(){
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
            val imageBitmap = data?.extras?.get("data") as Bitmap
            binding.Foto.setImageBitmap(imageBitmap)

        }

    }


}