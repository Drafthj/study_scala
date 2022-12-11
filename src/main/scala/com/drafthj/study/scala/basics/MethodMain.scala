package com.drafthj.study.scala.basics

object MethodMain {
  def main(args: Array[String]): Unit = {
    /**
     * 方法看起来和行为非常类似于函数
     * 由def关键字来定义，后面跟方法名、参数列表、回参类型和方法体
     */
    //回参类型和参数列表之间用:做分割
    def add(x: Int, y: Int): Int = x + y

    println(add(1, 2)) //2

    //多参数列表
    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier

    println(addThenMultiply(1, 2)(3)) //9

    //无参数列表
    def name: String = System.getProperty("user.name")

    println("hello," + name + "!")

    //多行表达式方法
    //scala中表达式最后一行结果是方法的返回值，scala中也存在return关键字，但是很少使用
    def getSquareString(input: Double): String = {
      val square = input * input
      square.toString
    }

    println(getSquareString(2.5)) //6.25
  }
}
