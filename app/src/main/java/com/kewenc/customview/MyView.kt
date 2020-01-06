package com.kewenc.customview

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
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

//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//         when(event?.actionMasked) {
//             MotionEvent.ACTION_DOWN -> Log.e("TAGF","MotionEvent.ACTION_DOWN="+MotionEvent.ACTION_DOWN)
//             MotionEvent.ACTION_UP -> Log.e("TAGF","MotionEvent.ACTION_UP="+MotionEvent.ACTION_UP)
//             MotionEvent.ACTION_MOVE -> Log.e("TAGF","MotionEvent.ACTION_MOVE="+MotionEvent.ACTION_MOVE)
//             MotionEvent.ACTION_CANCEL -> Log.e("TAGF","MotionEvent.ACTION_CANCEL="+MotionEvent.ACTION_CANCEL)
//             MotionEvent.ACTION_OUTSIDE -> Log.e("TAGF","MotionEvent.ACTION_OUTSIDE="+MotionEvent.ACTION_OUTSIDE)
//             MotionEvent.ACTION_POINTER_DOWN -> Log.e("TAGF","MotionEvent.ACTION_POINTER_DOWN="+MotionEvent.ACTION_POINTER_DOWN)
//             MotionEvent.ACTION_POINTER_UP -> Log.e("TAGF","MotionEvent.ACTION_POINTER_UP="+MotionEvent.ACTION_POINTER_UP)
//         }
////        when(event?.actionMasked) {
////            MotionEvent.ACTION_POINTER_DOWN -> Log.e("TAGF","_MotionEvent.ACTION_POINTER_DOWN="+MotionEvent.ACTION_POINTER_DOWN)
////            MotionEvent.ACTION_POINTER_UP -> Log.e("TAGF","_MotionEvent.ACTION_POINTER_UP="+MotionEvent.ACTION_POINTER_UP)
////        }
//        return true
//    }
}