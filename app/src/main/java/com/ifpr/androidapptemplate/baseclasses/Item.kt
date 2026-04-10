package com.ifpr.androidapptemplate.baseclasses

data class Item(
    var endereco: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null,
    var tamanho: String? = null,
    var valor: String? = null,
)
