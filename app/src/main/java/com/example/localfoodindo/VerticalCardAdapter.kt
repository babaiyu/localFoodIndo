package com.example.localfoodindo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class VerticalCardAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<VerticalCardAdapter.VerticalCardHolder>() {

    var onItemClick: ((Food) -> Unit)? = null

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): VerticalCardHolder {
        val view: View = LayoutInflater.from(p0.context).inflate(R.layout.vertical_card, p0, false)
        return VerticalCardHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(p0: VerticalCardHolder, p1: Int) {
        val (title, description, image) = listFood[p1]

        Glide.with(p0.itemView.context)
            .load(image)
            .apply(RequestOptions().override(100, 100))
            .into(p0.img)

        p0.foodName.text = title
        p0.foodDescription.text = description
    }

    inner class VerticalCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img: CircleImageView = itemView.findViewById(R.id.verticalImage)
        var foodName: TextView = itemView.findViewById(R.id.food_name)
        var foodDescription: TextView = itemView.findViewById(R.id.food_description)

        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(listFood[adapterPosition])
            }
        }
    }
}