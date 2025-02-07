package com.betrybe.trybevirtualmenu.models

import java.io.Serializable

data class MenuItem(
    var id: Int,
    val name: String,
    val imageResource: Int,
    val description: String,
    val price: String
) : Serializable
