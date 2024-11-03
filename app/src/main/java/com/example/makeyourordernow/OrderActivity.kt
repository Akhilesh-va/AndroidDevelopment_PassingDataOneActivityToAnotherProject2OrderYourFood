package com.example.makeyourordernow

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)
        val tvOrder=findViewById<TextView>(R.id.tvOrder)
        val odersOfCoustomer=intent.getStringExtra(MainActivity.KEY)
        tvOrder.text= "Coustmer order is : \n ${odersOfCoustomer.toString()}"

    }
}