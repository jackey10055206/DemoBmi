package com.example.demohello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    val mHeight: Double = 0
    val mWeight: Double = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

   private fun initView() {
       mHeight = findViewById<EditText>(R.id.height)
       mWeight = findViewById<EditText>(R.id.weight)


   }


    }


}
