package com.kewenc.customview

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.setOnTouchListener { v, event ->
            Log.e("TAGF", "onTouch_")
            false
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
//        Log.e("TAGF","dispatchTouchEvent_"+ev?.action)
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        Log.e("TAGF","onTouchEvent_"+event?.action)
        return super.onTouchEvent(event)
    }
}
