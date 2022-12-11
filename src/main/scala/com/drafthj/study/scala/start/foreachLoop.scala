package com.drafthj.study.scala.start

object foreachLoop {
  def main(args: Array[String]): Unit = {
    args.foreach(arg => println(arg))
    args.foreach((arg:String) => println(arg))
    args.foreach(println)
    for(arg <- args) {
      println(arg)
    }
  }
}
