package com.drafthj.study.scala.basics.classes.clazz

/**
 * scala中类以class关键字开头，
 *
 * @param prefix
 * @param suffix
 */
class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit = {
    println(prefix + name + suffix)
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val greeter = new Greeter("Hello, ", "!")
    greeter.greet("scala developer")
  }
}

