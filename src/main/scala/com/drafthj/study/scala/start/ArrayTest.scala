package com.drafthj.study.scala.start

import com.drafthj.study.scala.ApplyTest

import java.math.BigInteger

object ArrayTest {
  def main(args: Array[String]): Unit = {
    val big = new BigInteger("123456")
    val greeting = new Array[String](3);
    greeting(0) = "scala"
    greeting(1) = "is"
    greeting(2) = "fun"
    print(greeting)

    val greeting2 = Array("scala", "is", "fun")
    print(greeting2)
    val greeting3 = Array.apply("scala", "is", "fun")
    print(greeting3)
  }

  def print(arrays: Array[String]) = arrays.foreach(println)

}
