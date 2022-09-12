package mx.edu.ittepic.www

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.www.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.web.setOnClickListener{
            var otraVentana = Intent(this,MainActivity2::class.java)
            startActivity(otraVentana)
        }

        binding.res.setOnClickListener {
            AlertDialog.Builder(this).setTitle("Diseño responsivo")
                .setMessage("Curso actualemente en mantenimiento")
                .show()
        }

        binding.boot.setOnClickListener {
            Toast.makeText(this,"Curso no disponible",Toast.LENGTH_LONG).show()
        }

        binding.ang.setOnClickListener {
            var otraVentana = Intent(this,MainActivity3::class.java)
            startActivity(otraVentana)
        }

        binding.btnSalir.setOnClickListener {
            this.finish()
        }

    }
}