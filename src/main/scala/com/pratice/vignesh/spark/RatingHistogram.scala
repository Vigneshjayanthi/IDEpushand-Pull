package com.pratice.vignesh.spark

import org.apache.spark._
import org.apache.log4j._

object RatingHistogram {
  def main(args:Array[String]): Unit ={
    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = new SparkContext("local[*]","RatingsCounter");
    val sparkValue = sc.textFile("data/ml-100k/ml-100k/u.data")
    val result = sparkValue.map(x=>x.split("\t")(2))
    println(result.countByValue())
  }

}
