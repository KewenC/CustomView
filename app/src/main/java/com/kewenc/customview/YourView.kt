package com.kewenc.customview

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class YourView : View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet) : super(context, attrs)

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {

        return false
    }
}