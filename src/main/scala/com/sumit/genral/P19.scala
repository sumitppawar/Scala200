package com.sumit.genral

/*
P19 (**) Rotate a list N places to the left.
Examples:
scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
 */
object P19 {


  //First Solution
  def rotate[T](n: Int,ls: List[T]): List[T] = ls match {
    case Nil => ls
    case _ if(n == 0) => ls
    case _ if(n < 0 ) => rotate(n+1, ls.last::ls.init)
    case _ if(n>0)  => rotate(n-1, ls.tail:+ ls.head )
  }

}
