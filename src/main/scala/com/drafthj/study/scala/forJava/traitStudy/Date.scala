package com.drafthj.study.scala.forJava.traitStudy

class Date(y: Int, m: Int, d: Int) extends Ord {
  def year = y

  def month = m

  def day = d

  override def <(that: Any): Boolean = {
    if (!that.isInstanceOf[Date])
      sys.error("cannot compare " + that + "and a date")
    val o = that.asInstanceOf[Date]
    (year == o.year && (month < o.month ||
      (month == o.month && day < o.day)))
  }

  override def equals(that: Any): Boolean =
    that.isInstanceOf[Date] && {
      val o = that.asInstanceOf[Date]
      o.day == day && o.month == month && o.year == year
    }
}
