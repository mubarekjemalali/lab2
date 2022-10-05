package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var foodList  = arrayListOf<String>("Hamburger", "Pizza","Mexican", "American", "Chinese")


    fun decide(view: View) {
        var index = (Math.random() * (foodList.size) ).toInt()
        var foodChoice =  foodList[index]
        foodName.text = foodChoice
    }

    fun addFood(view: View) {
        var newFood = newFood.text.toString()
        foodList.add(newFood)
        foodName.text = newFood
    }
}