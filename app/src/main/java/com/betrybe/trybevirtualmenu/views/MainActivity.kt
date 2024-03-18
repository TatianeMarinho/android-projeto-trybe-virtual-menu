package com.betrybe.trybevirtualmenu.views

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.betrybe.trybevirtualmenu.R
import com.betrybe.trybevirtualmenu.adapters.MenuAdapter
import com.betrybe.trybevirtualmenu.interfaces.OnItemClickListener
import com.betrybe.trybevirtualmenu.models.VirtualMenuDatabase

class MainActivity : AppCompatActivity(), OnItemClickListener {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dishes = VirtualMenuDatabase.getDishes()
        val menuAdapter = MenuAdapter(dishes, this)

        val mainMenu = findViewById<RecyclerView>(R.id.main_menu)

        mainMenu.adapter = menuAdapter
        mainMenu.layoutManager = LinearLayoutManager(this)
        mainMenu.setHasFixedSize(true)
    }

        override fun onItemClick(view: View, position: Int) {
            val intent = Intent(this, MenuItemDetailActivity::class.java)
            intent.putExtra("menuItem", position)
            startActivity(intent)
        }
}
