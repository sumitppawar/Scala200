package com.sumit.code
/*
Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:
nth(2, List(1, 1, 2, 3, 5, 8))

 2
 */
object P03 extends App {
  
  println(nth(9, List(1, 1, 2, 3, 5, 8)))
  
  def nth[T](n:Int, ls:List[T]):T = 
    if(n>=0) 
      ls(n) 
    else 
      throw new IllegalArgumentException
      
  
  def nth_v2[T](n:Int, ls:List[T]):T = ls match {
    case s::_ if n == 0 => s
    case _:: tail => nth_v2(n-1, tail)
    case _ => throw new ArrayIndexOutOfBoundsException
  }
  
}