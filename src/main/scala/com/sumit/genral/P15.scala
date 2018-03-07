package com.sumit.code
/*
Duplicate the elements of a list a given number of times.
Example:
scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
 */
object P15 extends App {
  println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  def duplicateN[A](n: Int, ls:List[A]): List[A] = ls flatMap{e => List.fill(n)(e)}
}