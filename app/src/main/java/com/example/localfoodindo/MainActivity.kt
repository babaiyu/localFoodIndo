package com.example.localfoodindo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {}

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()
    private var titleBar: String = "Home"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(titleBar)

        rvFood = findViewById(R.id.verticalCard)
        rvFood.setHasFixedSize(true)

        list.addAll(dataFood.listData)
        home()

    }

    //Set Action Bar
    private fun setActionBarTitle(titleBar: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = titleBar
        }
    }

    private fun home() {
        //Init Vertical Card
        rvFood.layoutManager = LinearLayoutManager(this)
        val verticalCardAdapter = VerticalCardAdapter(list)
        rvFood.adapter = verticalCardAdapter

        //Navigating to Food Detail by pressed from list Card
        verticalCardAdapter.onItemClick = { item ->
            val navigate = Intent(this@MainActivity, FoodDetail::class.java)

            //Start Navigating
            navigate.putExtra(FoodDetail.title_food, item.name)
            navigate.putExtra(FoodDetail.description_food, item.description)
            navigate.putExtra(FoodDetail.image_food, item.image)
            navigate.putExtra(FoodDetail.price_food, item.price)
            startActivity(navigate)
        }
    }
}
