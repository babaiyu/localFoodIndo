package com.example.localfoodindo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {}

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.verticalCard)
        rvFood.setHasFixedSize(true)

        list.addAll(dataFood.listData)
        home()

    }

    private fun home() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val verticalCardAdapter = VerticalCardAdapter(list)
        rvFood.adapter = verticalCardAdapter
        verticalCardAdapter.onItemClick = { item ->
            val navigate = Intent(this@MainActivity, FoodDetail::class.java)
            navigate.putExtra(FoodDetail.title_food, item.name)
            navigate.putExtra(FoodDetail.description_food, item.description)
            startActivity(navigate)
        }
    }
}
