package com.drafthj.study.scala.basics

object BasicMain {
  def main(args: Array[String]): Unit = {
    /**
     * 输出结果使用println
     */
    println(1) //1
    println(1 + 1) //2
    println("hello") //hello
    println("hello" + "world") //hello world

    /**
     * values val
     */
    //values 不能重新赋值
    val x = 1 + 1
    // x = 3 重新赋值会报错
    println(x) //2
    //value可以指定类型，在:后，忽略就推测
    val y: Int = 2 + 2

    /**
     * var 变量，可以重新赋值
     */
    var z = 1 + 1
    println(z * z)
    //同理可以指定类型
    var o: Int = 1 + 1

    /**
     * block 块代码通过 {}来包裹,最后一行的结果为整块代码的结果
     */
    println({
      val x = 1 + 1
      x + 1
    })//3

  }
}
