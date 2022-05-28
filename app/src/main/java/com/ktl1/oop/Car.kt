package com.ktl1.oop

import android.util.Log

open class Car { //
    val carSpeed = 280
     open fun drive(){ // You should initiate parent class and functions as a open
        Log.i("message1","Drive a Car!")
    }
}