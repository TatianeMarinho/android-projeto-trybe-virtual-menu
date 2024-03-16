package com.betrybe.trybevirtualmenu.models

data class MenuItem(
    var id: Int,
    val name: String,
    val imageResource: Int,
    val description: String,
    val price: String
)
