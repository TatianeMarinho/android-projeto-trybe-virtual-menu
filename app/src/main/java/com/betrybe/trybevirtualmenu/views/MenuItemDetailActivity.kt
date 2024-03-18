package com.betrybe.trybevirtualmenu.views

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.betrybe.trybevirtualmenu.R
import com.betrybe.trybevirtualmenu.models.VirtualMenuDatabase

class MenuItemDetailActivity : AppCompatActivity() {
    private val detailTitle: TextView by lazy { findViewById(R.id.detail_title) }
    private val detailName: TextView by lazy { findViewById(R.id.detail_name) }
    private val detailImage: ImageView by lazy { findViewById(R.id.detail_image) }
    private val detailDescription: TextView by lazy { findViewById(R.id.detail_description) }
    private val detailPrice: TextView by lazy { findViewById(R.id.detail_price) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)

        val menuItemId = intent.getIntExtra("menuItem", 0)
        val dish = VirtualMenuDatabase.getDishById(menuItemId + 1)!!

        detailTitle.text = dish.name
        detailName.text = dish.name
        detailImage.setImageResource(dish.imageResource)
        detailDescription.text = dish.description
        detailPrice.text = "R$ ${ dish.price }"
    }
}

