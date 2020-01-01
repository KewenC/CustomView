package com.kewenc.customview

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.LinearLayout

class MyViewGroup : LinearLayout {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val mode = MeasureSpec.getMode(widthMeasureSpec)
        val size = MeasureSpec.getSize(widthMeasureSpec)
        Log.e("TAGF",mode.shr(30).toString() + "_" + size)
        val width = MeasureSpec.makeMeasureSpec(size/3, mode)

        val modeH = MeasureSpec.getMode(heightMeasureSpec)
        val sizeH = MeasureSpec.getSize(heightMeasureSpec)
        Log.e("TAGF",modeH.shr(30).toString() + "_" + sizeH)

//        measureChildren(widthMeasureSpec, heightMeasureSpec)
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        for (i in 0 until childCount) {
            val child = getChildAt(i)
            child.measure(width, heightMeasureSpec)
        }
    }
}