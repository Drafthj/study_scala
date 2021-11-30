package com.drafthj.study.scala.basics.unifiedTypes

import scala.runtime.Nothing$

/**
 * Any是所有类型的超类
 * Any又分为两类
 * 1、AnyVal代表值的类型：有九个预定义类型，并且他们不能为null
 * Double, Float, Long, Int, Short, Byte, Char, Unit, and Boolean
 * 2、AnyRef代表引用类型，包含所有的非值类型。所有用户定义的类型都是AnyRef的子类
 * AnyRef等同于JAVA的Object
 */
object Main {
  def main(args: Array[String]): Unit = {
    val list: List[Any] = List(
      "a string",
      732,
      'c',
      true,
      () => "an anonymous function returning a string",
      Unit
    )
    list.foreach(element => println(element))

    /**
     * 类型转换
     * Byte -> Short ->Int -> Long -> Float -> Double
     * ↑
     * Char
     */
    val x: Long = 987654321
    val y: Float = x
    val face: Char = '☺'
    val number: Int = face

    // val z: Long = y  not compile
  }
}
