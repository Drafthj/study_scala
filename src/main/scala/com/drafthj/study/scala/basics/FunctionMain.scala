package com.drafthj.study.scala.basics

object FunctionMain {
  def main(args: Array[String]): Unit = {
    /**
     * functions 函数是带有参数的表达式
     * 由 =>连接，左边是参数列表，右边是涉及参数的表达式
     */
    val addOne = (x: Int) => x + 1
    println(addOne(1))
    //多参数函数
    val add = (x: Int, y: Int) => x + y
    println(add(1, 1)) //2
    //无参数函数
    val getTheAnswer = () => 42
    println(getTheAnswer()) //42
  }
}
