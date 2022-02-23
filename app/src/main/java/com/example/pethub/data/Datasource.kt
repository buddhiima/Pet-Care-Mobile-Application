package com.example.pethub.data

import android.annotation.SuppressLint
import com.example.pethub.R
import com.example.pethub.model.ProductList

class Datasource {
    @SuppressLint("ResourceType")
    fun loadVersions() : List<ProductList>{

        return listOf<ProductList>(

            ProductList(R.string.item1,R.string.price1, R.drawable.image5),
            ProductList(R.string.item2,R.string.price2, R.drawable.image4),
            ProductList(R.string.item3,R.string.price3, R.drawable.image1),
            ProductList(R.string.item4,R.string.price4, R.drawable.image3),
            ProductList(R.string.item5,R.string.price1, R.drawable.image5)



        )
    }

}