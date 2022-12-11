package com.drafthj.study.scala.basics.classes.traits

/**
 * trait是抽象数据类型，可以包含方法和字段，
 * class只能继承一个其他class,但是可以扩展多个traits
 */
trait Greeter {
  //  def greet(name: String): Unit
  //方法可以有默认实现
  def greet(name: String): Unit = {
    println("hello," + name + "!")
  }
}
