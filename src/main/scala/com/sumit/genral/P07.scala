package com.sumit.code

/*
Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */
object P07 extends App {
  
  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  
  def flatten(ls:List[Any]):List[Any] = ls flatMap {
    case x:List[_] => flatten(x)
    case e => List(e)
  }
  
}