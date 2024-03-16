package com.betrybe.trybevirtualmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.betrybe.trybevirtualmenu.R
import com.betrybe.trybevirtualmenu.adapters.MenuAdapter
import com.betrybe.trybevirtualmenu.models.VirtualMenuDatabase

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dishes = VirtualMenuDatabase.getDishes()
        val menuAdapter = MenuAdapter(dishes)

        val mainMenu = findViewById<RecyclerView>(R.id.main_menu)

        mainMenu.adapter = menuAdapter
        mainMenu.layoutManager = LinearLayoutManager(this)
        mainMenu.setHasFixedSize(true)
    }
}
