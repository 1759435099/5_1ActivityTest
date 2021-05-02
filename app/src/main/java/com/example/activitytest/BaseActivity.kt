package com.example.activitytest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
//用于得知是哪个Activity
open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity",javaClass.simpleName)
        ActivityCollector.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.finishAll()
    }
}