package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val result = myFirstFunction(2, 3.2)
        println(result)

    }
}
fun myFirstFunction(i: Int , l : Double) = i / l
