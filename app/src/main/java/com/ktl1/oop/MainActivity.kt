package com.ktl1.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val car = Car()
//        car.drive()
//
//        val driver = Driver("Nirmal")
//        Log.i("driverAge","${driver.showDriverName()}")


        val myCar = MyCar()
        Log.i("myCarSpeed","${myCar.carSpeed}  ${myCar.drive()}")
        myCar.accelerate()
    }
}