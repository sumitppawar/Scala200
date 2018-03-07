package com.sumit.code
/*
Split a list into two parts.
The length of the first part is given. Use a Tuple for your result.
Example:

scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
 */
object P17 extends App {
  
  println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  def split[A](n:Int,ls:List[A]): (List[A],List[A]) = (ls.take(n), ls.drop(n))
  
  def splitUsingLib[A](n:Int,ls:List[A]): (List[A],List[A]) = ls.splitAt(n)
}