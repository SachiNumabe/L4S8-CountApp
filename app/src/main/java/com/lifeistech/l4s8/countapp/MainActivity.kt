package com.lifeistech.l4s8.countapp

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countView.text = count.toString()
        color(count)

        plus.setOnClickListener {
            count += 1
            countView.text = count.toString()
            color(count)
        }

        minus.setOnClickListener {
            count -= 1
            countView.text = count.toString()
            color(count)
        }

        clear.setOnClickListener {
            count = 0
            countView.text = count.toString()
            color(count)
        }
    }

    fun color(i) {
        when {
            i % 15 == 0 -> countView.setTextColor(Color.rgb(255,0,0))
            i % 3 == 0 -> countView.setTextColor(Color.rgb(0,255,0))
            i % 5 == 0 -> countView.setTextColor(Color.rgb(0,0,250))
            else -> countView.setTextColor(Color.rgb(0,0,0))
        }

//        if (i % 15 == 0) {
//            countView.setTextColor(Color.rgb(255,0,0))
//        }
//        else if (i % 5 == 0) {
//            countView.setTextColor(Color.rgb(0,0,255))
//        }
//        else if (i % 3 == 0){
//            countView.setTextColor(Color.rgb(0,255,0))
//        }
//        else{
//            countView.setTextColor(Color.rgb(0,0,0))
//        }
    }
}
