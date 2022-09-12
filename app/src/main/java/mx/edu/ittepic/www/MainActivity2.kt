package mx.edu.ittepic.www

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.ittepic.www.databinding.ActivityMain2Binding

lateinit var binding: ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegresar.setOnClickListener{
            this.finish()
        }
    }

}