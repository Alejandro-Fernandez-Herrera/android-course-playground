package com.alejandrofernandez.bmicalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.alejandrofernandez.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Generated from activity_main.xml; assigned in onCreate, so lateinit
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inflates the layout, sets it as the screen AND returns the binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Keeps content from being drawn under the status/navigation bars
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}