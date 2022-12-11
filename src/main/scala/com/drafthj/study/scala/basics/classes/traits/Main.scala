package com.drafthj.study.scala.basics.classes.traits

object Main {
  def main(args: Array[String]): Unit = {
    val greeter = new DefaultGreeter();
    greeter.greet("Scala developer")

    val customizableGreeter = new CustomizableGreeter("How are you, ", "?")
    customizableGreeter.greet("Scala developer")
  }
}
