package com.alejandrofernandez.bmicalculator

import androidx.annotation.StringRes

object BmiCalculator {

    // Pure: weight in kg, height in m -> BMI. No Android imports.
    fun calculate(weightKg: Double, heightM: Double): Double {
        require(weightKg > 0) { "Weight must be greater than zero" }
        require(heightM > 0) { "Height must be greater than zero" }
        return weightKg / (heightM * heightM)
    }

    // Pure: BMI -> string resource id of the category (R.string.category_normal, ...)
    @StringRes
    fun categoryFor(bmi: Double): Int {
        return when {
            bmi < 18.5 -> R.string.category_underweight
            bmi < 25.0 -> R.string.category_normal
            bmi < 30.0 -> R.string.category_overweight
            else -> R.string.category_obesity
        }
    }
}
