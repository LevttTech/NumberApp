package com.levtttech.numberapp.main

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.levtttech.numberapp.R
import com.levtttech.numberapp.numbers.presentation.NumbersFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null)
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, NumbersFragment())
                .commit()
    }
}