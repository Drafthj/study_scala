package com.drafthj.study.scala.basics.classes.caseClazz

/**
 * case class是scala的特殊类型
 * 不可变，并且通过值比较，class是通过引用比较的
 */
case class Point(x: Int, y: Int)

object Main {
  def main(args: Array[String]): Unit = {
    //case class不需要new关键字
    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)
    if (point == anotherPoint) {
      println(s"$point and $anotherPoint are the same.")
    } else {
      println(s"$point and $anotherPoint are different.")
    }

    if (anotherPoint == yetAnotherPoint) {
      println(s"$anotherPoint and $yetAnotherPoint are the same.")
    } else {
      println(s"$anotherPoint and $yetAnotherPoint are different.")
    }
  }
}
