package com.example.recyclerviewwithitemclick_30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val food = intent.getParcelableExtra<Food>("food")
        if (food != null){
            val textView:TextView = findViewById(R.id.textViewDetailed)
            val imageView:ImageView = findViewById(R.id.imageViewDetailed)

            textView.text = food.name
            imageView.setImageResource(food.image)
        }

    }
}