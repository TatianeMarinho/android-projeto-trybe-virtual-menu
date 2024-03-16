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
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_menu_item_detail, parent, false)
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
        private val itemNameTextView: TextView = itemView.findViewById(R.id.detail_name)
        private val itemImageView: ImageView = itemView.findViewById(R.id.detail_image)
        private val itemDescriptionTextView: TextView = itemView.findViewById(R.id.detail_description)
        private val itemPriceTextView: TextView = itemView.findViewById(R.id.detail_price)

        fun bind(menuItem: MenuItem) {
            itemNameTextView.text = menuItem.name
            itemImageView.setImageResource(menuItem.imageResource)
            itemDescriptionTextView.text = menuItem.description
            itemPriceTextView.text = menuItem.price
        }
    }
}