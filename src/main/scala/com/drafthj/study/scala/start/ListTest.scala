package com.drafthj.study.scala.start

object ListTest {
  def main(args: Array[String]): Unit = {
    val oneTwoThree = List(1, 2, 3)
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour + " is not mutable")
    println("thus," + oneTwoThreeFour + " is a new list")

    val oneTwo2 = List(1, 2)
    val oneTwoThree2 = 1 :: oneTwo2
    println(oneTwoThree2)

    val oneTwoThree3 = 1 :: 2 :: 3 :: Nil
    println(oneTwoThree3)

    val thrill = "will" :: "fill" :: "until" :: Nil
    println(thrill(2))
    println("count:" + thrill.count(s => s.length == 4))
    println("tail:" + thrill.tail)
    println("init:" + thrill.init)
    println("head:" + thrill.head)
    println("last:" + thrill.last)
  }
}
