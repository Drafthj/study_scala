package com.drafthj.study.scala.forJava.genericTest

class Reference[T] {
  private var content: T = _

  def set(value: T) {
    content = value
  }

  def get: T = content
}
