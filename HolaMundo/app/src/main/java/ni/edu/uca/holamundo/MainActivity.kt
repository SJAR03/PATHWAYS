package ni.edu.uca.holamundo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1 = findViewById<View>(R.id.etnNumber1) as EditText
        var num2 = findViewById<View>(R.id.etnNumber2) as EditText
        var btn = findViewById<View>(R.id.btnCalcular) as Button

        btn.setOnClickListener(View.OnClickListener {
            var result = suma(num1.text.toString().toInt(), num2.text.toString().toInt())
            Toast.makeText(null, "El resultado es $result", Toast.LENGTH_LONG).show()
        })
    }
    fun suma (num1: Int, num2: Int):Int{
        return num1 + num2
    }
}