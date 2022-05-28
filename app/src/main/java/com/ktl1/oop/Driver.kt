package com.ktl1.oop

import android.util.Log

class Driver(/*name : String = "Kamal"*/name : String = "Kamal") {
//    var driverName = name
    var driverName = ""

    val car = Car()

    init {
        driverName = name
        car.drive()
    }

    fun showDriverName(): Int {
        Log.i("driverName","Driver name is $driverName")
        return 12
    }

}