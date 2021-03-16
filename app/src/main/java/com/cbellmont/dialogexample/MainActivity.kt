package com.cbellmont.dialogexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.cbellmont.dialogexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bShowDialog.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("¿Aceptas ${binding.etText.text}?")
            .setPositiveButton("Sí") { dialog, id ->
                Toast.makeText(this, "${binding.etText.text} ha sido aceptado", Toast.LENGTH_LONG).show()
            }
            .setNegativeButton("No") { dialog, id ->
                Toast.makeText(this, "${binding.etText.text} ha sido cancelado", Toast.LENGTH_LONG).show()
            }
        builder.create()
        builder.show()
    }
}