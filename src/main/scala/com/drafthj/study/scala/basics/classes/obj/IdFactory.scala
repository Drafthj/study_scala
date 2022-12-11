package com.drafthj.study.scala.basics.classes.obj

/**
 * 类似于单例，以object关键字创建，通过名字来调用
 */
object IdFactory {
  private var counter = 0;

  def create(): Int = {
    counter += 1
    counter
  }

  def main(args: Array[String]): Unit = {
    val newId = IdFactory.create()
    println(newId)
    val newerId = IdFactory.create()
    println(newerId)
  }
}
