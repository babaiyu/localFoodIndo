package com.example.localfoodindo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.food_detail.view.*

class FoodDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_detail)

        val titleDataReceive: TextView = findViewById(R.id.titleReceive)
        val descriptionDataReceive: TextView = findViewById(R.id.descriptionReceive)
        val imageDataReceive: ImageView = findViewById(R.id.imageReceive)

        val title = intent.getStringExtra(title_food)
        val description = intent.getStringExtra(description_food)
        val image = intent.getStringExtra(image_food)

        titleDataReceive.text = title // Show Title Food
        descriptionDataReceive.text = description // Show Description Food
        Glide.with(imageDataReceive)
            .load(image)
            .into(imageDataReceive) // Show Image Food

        //Set Action Bar
        setActionBarTitle(title)
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
    }
}
