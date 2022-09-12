package mx.edu.ittepic.www

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.ittepic.www.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegresar.setOnClickListener {
            this.finish()
        }
    }
}