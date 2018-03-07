package com.sumit.code

/*

Find the number of elements of a list.
Example:
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6

 */
object P04 extends App {
  
  println(lengthV2(List(1, 1, 2, 3, 5, 8)))
  
  //Using Lib
  def length[T](ls:List[T]):Int = ls.length
  
  //Without Tail Recursion
  def lengthV2[T](ls:List[T]):Int = ls match {
    case Nil => 0
    case _::tail => 1 + lengthV2(tail)
  }
  
  //With Tail Recursion
  //Tail Recursion run in constant space
  //But JVM does not do anything about tail recursion
  //But scala will* do if method is final or local
  

  //Using foldLeft
  def lengthV3[T](ls:List[T]):Int = ls.foldLeft(0){(c,_) => c+1}
  
}