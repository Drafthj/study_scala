package com.drafthj.study.scala.forJava

object Timer {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback();
      Thread sleep (1000)
    }
  }

  //  def timeFiles(): Unit = {
  //    println("time files like an arrow")
  //  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() => println("time files like an arrow"))
  }
}
