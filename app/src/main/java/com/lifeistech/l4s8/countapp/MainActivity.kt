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

        countViewSet(count)
        key(count)

        plusButton.setOnClickListener {
            count += 1
            countViewSet(count)
            key(count)
        }

        minusButton.setOnClickListener {
            count -= 1
            countViewSet(count)
            key(count)
        }

        clearButton.setOnClickListener {
            count = 0
            countViewSet(count)
            key(count)
        }
    }

    fun countViewSet(i:Int) {
        countTextView.text = i.toString()
        when {
            i % 15 == 0 -> countTextView.setTextColor(Color.rgb(255,0,0))
            i % 3 == 0 -> countTextView.setTextColor(Color.rgb(0,255,0))
            i % 5 == 0 -> countTextView.setTextColor(Color.rgb(0,0,250))
            else -> countTextView.setTextColor(Color.rgb(0,0,0))
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

    fun key(i: Int){
        when{
            i == 1 -> keyWordView.text = "apple"
            i == 2 -> keyWordView.text = "banana"
            i == 3 -> keyWordView.text = "cat"
            i == 4 -> keyWordView.text = "dog"
            else -> keyWordView.text = "その番号のキーワードは存在しません"
        }
    }
}
