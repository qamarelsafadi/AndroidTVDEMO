package com.egeniq.androidtvprogramguide

import android.os.Handler
import android.os.Looper

object utils {
    fun <T> (() -> T).withDelay(delay: Long = 250L) {
        Handler(Looper.getMainLooper()).postDelayed({ this.invoke() }, delay)
    }
}