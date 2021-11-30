package com.drafthj.study.scala.forJava.genericTest

object IntegerReference {
  def main(args: Array[String]): Unit = {
    val cell = new Reference[Int]
    cell.set(2)
    println(cell.get)
  }
}
