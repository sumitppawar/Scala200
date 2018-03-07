package com.sumit.code
/*
Run-length encoding of a list.
Example:
scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

 */
object P10 extends App {
  
  println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  
  def encode[A](ls:List[A]): List[(Int,A)] = ls match {
    case Nil => Nil
    case e:: tail => List((ls.takeWhile(_ == e).length, e)) ::: encode(tail.dropWhile(_ == e))
  } 
  
}