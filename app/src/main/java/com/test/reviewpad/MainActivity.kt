package com.test.reviewpad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import fr.wemoms.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (0..10).forEach {
            findViewById<ViewGroup>(android.R.id.content).addView(TextView(this).apply {
                text = it.toString()
            })
        }
    }
}