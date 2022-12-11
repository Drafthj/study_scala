package com.drafthj.study.scala.forJava.caseClass

object Main {
  type Environment = String => Int

  def eval(t: Tree, env: Environment): Int = t match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n) => env(n)
    case Constant(v) => v
  }

  def derive(t: Tree, v: String): Tree = {
    t match {
      case Sum(l, r) => Sum(derive(l, v), derive(r, v))
      case Var(n) if (v == n) => Constant(1)
      case _ => Constant(0)
    }
  }

  def main(args: Array[String]): Unit = {
    val exp: Tree = Sum(Sum(Var("x"), Var("x")), Sum(Constant(7), Var("y")))
    val env: Environment = {
      case "x" => 5
      case "y" => 7
    }
    println("Expression：" + exp)
    println("Evaluation with x=5 y=7:" + eval(exp, env))
    println("Derive relative to x: " + derive(exp, "x"))
    println("Derive relative to y: " + derive(exp, "y"))
  }
}
