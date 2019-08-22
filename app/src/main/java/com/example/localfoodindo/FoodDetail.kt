package com.example.localfoodindo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide

class FoodDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_detail)


        val titleDataReceive: TextView = findViewById(R.id.titleReceive)
        val descriptionDataReceive: TextView = findViewById(R.id.descriptionReceive)
        val imageDataReceive: ImageView = findViewById(R.id.imageReceive)
        val priceDataReceive: TextView = findViewById(R.id.priceDetail)
        val pressFood: Button = findViewById(R.id.buttonFood)

        val title = intent.getStringExtra(title_food)
        val description = intent.getStringExtra(description_food)
        val image = intent.getStringExtra(image_food)
        val price = intent.getStringExtra(price_food)

        titleDataReceive.text = title // Show Title Food
        descriptionDataReceive.text = description // Show Description Food
        Glide.with(imageDataReceive)
            .load(image)
            .into(imageDataReceive) // Show Image Food
        priceDataReceive.text = "Rp. $price"

        //Set Action Bar
        setActionBarTitle(title)

        pressFood.setOnClickListener {
            Toast.makeText(this, "Thank you for choosing $title", Toast.LENGTH_SHORT).show()
        }
    }

    //Set Action Bar
    private fun setActionBarTitle(titleBar: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = titleBar
        }
    }

    companion object {
        const val title_food = "title_food"
        const val description_food = "description_food"
        const val image_food = "image_url"
        const val price_food = "price_food"
    }
}
