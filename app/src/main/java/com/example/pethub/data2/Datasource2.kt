package com.example.pethub.data2

import android.annotation.SuppressLint
import com.example.pethub.R
import com.example.pethub.model2.ProductList2

class Datasource2 {
    @SuppressLint("ResourceType")
    fun loadVersions1() : List<ProductList2>{

        return listOf<ProductList2>(

            ProductList2(R.string.noti1,R.drawable.image5),
            ProductList2(R.string.noti2,R.drawable.image4)




        )
    }
}