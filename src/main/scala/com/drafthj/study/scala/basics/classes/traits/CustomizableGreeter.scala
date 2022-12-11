package com.drafthj.study.scala.basics.classes.traits

class CustomizableGreeter(prefix: String, suffix: String) extends Greeter {
  //override关键字可以覆盖方法
  override def greet(name: String): Unit = println(prefix + name + suffix)
}
