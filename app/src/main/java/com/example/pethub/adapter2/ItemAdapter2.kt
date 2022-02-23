package com.example.pethub.adapter2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pethub.R
import com.example.pethub.model2.ProductList2

class ItemAdapter2 (private val context1: Context, private val dataset1: List<ProductList2> )
    : RecyclerView.Adapter<ItemAdapter2.ItemViewHolder> () {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView1: TextView = view.findViewById(R.id.item_titleN)
        val imageView2: ImageView = view.findViewById(R.id.item_imageN)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout2 = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item2,parent,false)
        return ItemAdapter2.ItemViewHolder(adapterLayout2)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item1 = dataset1[position]
        holder.textView1.text = context1.resources.getString(item1.stringResourceID1)
        holder.imageView2.setImageResource(item1.imageResources1)
    }

    override fun getItemCount(): Int {
        return dataset1.size
    }
}