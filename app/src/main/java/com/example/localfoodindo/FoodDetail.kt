package com.example.localfoodindo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.TextView

class FoodDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_detail)

        val titleDataReceive: TextView = findViewById(R.id.titleReceive)
        val descriptionDataReceive: TextView = findViewById(R.id.descriptionReceive)

        val title = intent.getStringExtra(title_food)
        val description = intent.getStringExtra(description_food)

        titleDataReceive.text = title
        descriptionDataReceive.text = description

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
    }
}
