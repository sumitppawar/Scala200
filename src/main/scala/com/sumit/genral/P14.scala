package com.sumit.code
/*
Duplicate the elements of a list.
Example:
scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
 */
object P14 extends App {
  println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  def duplicate[A](ls: List[A]): List[A] = ls flatMap (e => List.fill(2)(e))
}