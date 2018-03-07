package com.sumit.code

/*
Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */
object P05 extends App {
  
  println(functionalReverse(List(1, 1, 2, 3, 5, 8)))

  //Recursive
	def reverse[T](ls:List[T]):List[T] = ls match {
	  case Nil => Nil
	  case f::tail => reverse(tail) ::: List(f)
	}
  
  //Pure Function
  def functionalReverse[T](ls: List[T]): List[T] = ls.foldLeft(List[T]()){(list,e) => e :: list}
}