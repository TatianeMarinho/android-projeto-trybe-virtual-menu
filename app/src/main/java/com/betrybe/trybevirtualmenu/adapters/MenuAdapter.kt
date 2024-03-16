package com.betrybe.trybevirtualmenu.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.betrybe.trybevirtualmenu.models.MenuItem
import com.betrybe.trybevirtualmenu.R

class MenuAdapter(private val menuItems: List<MenuItem>) : Adapter<MenuAdapter.MenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_menu_layout, parent, false)
        return MenuViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val currentItem = menuItems[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int {
        return menuItems.size
    }

    class MenuViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val itemMenuNameTextView: TextView = itemView.findViewById(R.id.item_menu_name)
        private val itemMenuImageView: ImageView = itemView.findViewById(R.id.item_menu_image)

        fun bind(menuItem: MenuItem) {
            itemMenuNameTextView.text = menuItem.name
            itemMenuImageView.setImageResource(menuItem.imageResource)
        }
    }
}