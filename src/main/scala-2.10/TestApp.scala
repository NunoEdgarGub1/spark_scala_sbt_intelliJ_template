package com.pc

import org.apache.spark.{SparkConf, SparkContext}

object TestApp {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("TestApp")
    val sc = new SparkContext(conf)

    println(sc)
  }
}


