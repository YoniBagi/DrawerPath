package com.bagi.drawpath

import android.content.res.Resources

object UiUtils {
    val Float.dp: Int get() = (this / Resources.getSystem().displayMetrics.density).toInt()
    val Float.px: Int get() = (this * Resources.getSystem().displayMetrics.density).toInt()
    fun getWidthDisplayScreenSize() = Resources.getSystem().displayMetrics.widthPixels
}