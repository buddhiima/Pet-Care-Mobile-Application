package com.example.pethub.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import  android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.pethub.R
import com.example.pethub.model.ProductList

class ItemAdapter (private val context: Context, private val dataset: List<ProductList> )
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder> (){
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView1: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textView: TextView = view.findViewById(R.id.item_price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView1.text = context.resources.getString(item.stringResourceID)
        holder.textView.text = context.resources.getString(item.stringResourceID1)
        holder.imageView.setImageResource(item.imageResources)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}