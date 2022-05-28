package com.ktl1.oop

import android.util.Log

class MyCar : Car(), SpeedController {
    override fun drive() {
        Log.i("message1", "Drive a My Car!")
        Log.i("brandId", getBrandId())

    }

    override fun accelerate() {
        val a = 10
        val b = 100
        Log.i("sum", "${a + b}")
    }

    override fun decelerate() {
        val a = 10
        val b = 100
        Log.i("dec", "${a - b}")
    }
}