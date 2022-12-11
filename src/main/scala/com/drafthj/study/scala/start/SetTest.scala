package com.drafthj.study.scala.start
import scala.collection.mutable
object SetTest {
  def main(args: Array[String]): Unit = {
    var set1 = Set("a", "b")
    set1 += "c"
    println(set1.contains("d"))

    val set2 = mutable.Set("a", "b")
    set2 += "c"
    println(set2)

    val hashSet
  }
}
