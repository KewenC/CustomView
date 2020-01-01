package com.kewenc.customview

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class MyView : View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet) : super(context, attrs)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//        Log.e("TAGF","getParent="+(parent as ConstraintLayout).width)
////        setMeasuredDimension(50, 50)
//        val mode = MeasureSpec.getMode(widthMeasureSpec)
//        val size = MeasureSpec.getSize(widthMeasureSpec)
//        Log.e("TAGF",mode.shr(30).toString() + "_" + size)
    }
}