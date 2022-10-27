package com.example.recyclerviewwithitemclick_30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.dosa, "Dosa"))
        foodList.add(Food(R.drawable.biryani, "Biryani"))
        foodList.add(Food(R.drawable.noodles, "Noodles"))
        foodList.add(Food(R.drawable.paneer_masala,"Paneer Masala"))
        foodList.add(Food(R.drawable.pasta, "Pasta"))
        foodList.add(Food(R.drawable.pizza, "Pizza"))
        foodList.add(Food(R.drawable.plov, "Plov"))
        foodList.add(Food(R.drawable.barbecue, "Barbecue"))

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter
    }
}