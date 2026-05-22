package com.ifpr.androidapptemplate.ui.home

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Base64
import androidx.appcompat.app.AppCompatActivity
import com.ifpr.androidapptemplate.R
import android.widget.TextView
import android.widget.ImageView
class DetalhesItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle? ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_item)

        val endereco = intent.getStringExtra("endereco")
        val valor = intent.getStringExtra("valor")
        val base64Image = intent.getStringExtra("base64Image")
        val tamanho = intent.getStringExtra("tamanho")

        val enderecoView = findViewById<TextView>(R.id.textViewTituloDetalhe)
        enderecoView.text = endereco


        val imageView = findViewById<ImageView>(R.id.imageViewDetalhe)
        val bytes = Base64.decode(base64Image, Base64.DEFAULT)
        val bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
        imageView.setImageBitmap(bitmap)

        val valorView = findViewById<TextView>(R.id.textViewValor)
        "R$ $valor".also { valorView.text = it }

        val tamanhoView = findViewById<TextView>(R.id.textViewTamanho)
        (tamanho + "m²").also { tamanhoView.text = it }


    }
}