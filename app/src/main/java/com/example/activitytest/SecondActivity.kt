package com.example.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val button2:Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent()
            intent.putExtra("data_return","Hello FristAcitivty")
            setResult(RESULT_OK,intent)
            finish()

        }
    }
}