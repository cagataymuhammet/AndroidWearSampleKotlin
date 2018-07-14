package com.cagataymuhammet.androidwearsample

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Button
import android.widget.TextView


class ActivityMain : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        setAmbientEnabled()

        var count=0
        val btnCounter = findViewById<Button>(R.id.btnCounter)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtCount = findViewById<TextView>(R.id.txtCount)

        btnClear.setOnClickListener {
            count=0
            txtCount.text="0"
        }

        btnCounter.setOnClickListener {
            count=count+1
            txtCount.text=count.toString()
        }
    }
}
