package com.ktl1.oop

import android.util.Log

interface SpeedController {


    fun accelerate()
    fun decelerate()

    fun getBrandId(): String {
        return "WSGTK55DN56SS"
    }

}