package com.drafthj.study.scala.start

object WhileLoop {
  def main(args: Array[String]): Unit = {
    var i = 0
    while(i < args.length) {
      println(args(i))
      i +=1
    }
  }

}
