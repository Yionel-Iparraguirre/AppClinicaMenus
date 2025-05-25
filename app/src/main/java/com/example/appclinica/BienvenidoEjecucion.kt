package com.example.appclinica
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PresentacionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bienvenido) // tu layout de bienvenida

        val btnContinuar = findViewById<Button>(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            val intent = Intent(this, ListaDocsActivity::class.java)
            startActivity(intent)
            finish() // Para que no regrese a bienvenida al pulsar atrás
        }
    }
}