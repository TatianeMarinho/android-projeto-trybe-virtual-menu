package com.betrybe.trybevirtualmenu.interfaces

import android.view.View

interface OnItemClickListener {
    fun onItemClick(view : View, position: Int)
}