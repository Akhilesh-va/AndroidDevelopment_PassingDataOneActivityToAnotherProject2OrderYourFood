package com.example.makeyourordernow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //Companion object is liye use kra hai taki key globally khi bhi access ho jaye


    companion object {
        // Members of the companion object
        val KEY ="com.example.makeyourordernow.MainActivity.KEY" // this done so ki unique naam rhe ye bas naam hai koi syntax ni hai
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val et3=findViewById<EditText>(R.id.et3)
        val et4=findViewById<EditText>(R.id.et4)

        btnOrder.setOnClickListener{
            val orderList = "1- " + et1.text.toString() +"\n" + "2- " + et2.text.toString() +"\n" + "3- "+et3.text.toString() +"\n" + "4- "+et4.text.toString()
        intent = Intent(this,OrderActivity::class.java)
            //putExtra data us side le ke jayega but key aur kya le janan hai wo batana hoga
        intent.putExtra(KEY,orderList)
            startActivity(intent)
        }

    }
}