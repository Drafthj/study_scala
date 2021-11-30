package com.drafthj.study.scala.classes

/**
 * 构造函数在类名后面，默认参数值用=赋值
 * @param x
 * @param y
 */
class Point(var x: Int = 0, var y: Int = 0) {
  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
  }

  override def toString: String = s"$x,$y"
}

object Main {
  def main(args: Array[String]): Unit = {
    val point = new Point(2,3)
    point.move(1,3)
    println(point)

    val p1 = new Point
    //存在默认值
    println(p1)

    //覆盖x
    val p2 = new Point(1)
    println(p2)

    //若要覆盖y,需要赋值表达式
    val p3 = new Point(y = 2)
    println(p3)
  }
}
