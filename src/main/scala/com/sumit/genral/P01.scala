package com.sumit.code

/*
Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
 */
object P01 extends App {
  
  val lastValue = last(List(1, 1, 2, 3, 5, 8))
  println(lastValue) //8 
  
  def last[T](ls: List[T]):T = ls match {
    case first::Nil => first
    case _::tail => last(tail)
    case _ => throw new NoSuchElementException
  }
  
}