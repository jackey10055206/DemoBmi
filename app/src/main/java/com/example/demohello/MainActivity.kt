package com.example.demohello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

   private fun initView() {

       Submit.setOnClickListener {
           var mHeight = input_height.text.toString().toDouble()
           var mWeight = input_weight.text.toString().toDouble()

           mHeight = mHeight / 100

           var result = mWeight/(mHeight*mHeight)

           bmi_result.text = result.toString()
       }

   }


}

