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

        binding.btnCalculate.setOnClickListener { onCalculateClicked() }
    }

    private fun onCalculateClicked() {
        // Clear previous errors
        binding.tilWeight.error = null
        binding.tilHeight.error = null

        val weightStr = binding.etWeight.text.toString().trim()
        val heightStr = binding.etHeight.text.toString().trim()

        var hasError = false

        val weight = weightStr.replace(',', '.').toDoubleOrNull()
        if (weightStr.isEmpty()) {
            binding.tilWeight.error = getString(R.string.error_required)
            hasError = true
        } else if (weight == null || weight <= 0) {
            binding.tilWeight.error = getString(R.string.error_invalid)
            hasError = true
        }

        val height = heightStr.replace(',', '.').toDoubleOrNull()
        if (heightStr.isEmpty()) {
            binding.tilHeight.error = getString(R.string.error_required)
            hasError = true
        } else if (height == null || height <= 0) {
            binding.tilHeight.error = getString(R.string.error_invalid)
            hasError = true
        }

        if (hasError || weight == null || height == null) {
            return
        }

        val bmi = BmiCalculator.calculate(weight, height)
        val categoryRes = BmiCalculator.categoryFor(bmi)

        val bmiText = "%.1f".format(bmi)
        val categoryText = getString(categoryRes)

        binding.tvResult.text = getString(R.string.result_format, bmiText, categoryText)
    }
}
