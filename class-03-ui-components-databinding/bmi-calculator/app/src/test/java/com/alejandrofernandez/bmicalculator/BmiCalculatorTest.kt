package com.alejandrofernandez.bmicalculator

import org.junit.Assert.assertEquals
import org.junit.Test

class BmiCalculatorTest {

    @Test
    fun calculate_correctBmi() {
        // 70 kg, 1.75 m -> 70 / (1.75 * 1.75) = 22.85714...
        val bmi = BmiCalculator.calculate(70.0, 1.75)
        assertEquals(22.86, bmi, 0.01)
    }

    @Test(expected = IllegalArgumentException::class)
    fun calculate_zeroWeight_throwsException() {
        BmiCalculator.calculate(0.0, 1.75)
    }

    @Test(expected = IllegalArgumentException::class)
    fun calculate_negativeHeight_throwsException() {
        BmiCalculator.calculate(70.0, -1.75)
    }

    @Test
    fun categoryFor_underweight() {
        val categoryRes = BmiCalculator.categoryFor(17.5)
        assertEquals(R.string.category_underweight, categoryRes)
    }

    @Test
    fun categoryFor_normal() {
        val categoryRes = BmiCalculator.categoryFor(22.5)
        assertEquals(R.string.category_normal, categoryRes)
    }

    @Test
    fun categoryFor_overweight() {
        val categoryRes = BmiCalculator.categoryFor(27.0)
        assertEquals(R.string.category_overweight, categoryRes)
    }

    @Test
    fun categoryFor_obesity() {
        val categoryRes = BmiCalculator.categoryFor(32.0)
        assertEquals(R.string.category_obesity, categoryRes)
    }
}
