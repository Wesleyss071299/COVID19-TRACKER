package com.example.covid19

import com.robinhood.spark.SparkAdapter

class CovidSparkAdapter(private val dailyData: List<CovidData>) :  SparkAdapter() {
    override fun getCount() = dailyData.size

    override fun getItem(index: Int) = dailyData[index]

    override fun getY(index: Int): Float {
       val chosenData = dailyData[index]
        return chosenData.positiveIncrease.toFloat()
    }

}
