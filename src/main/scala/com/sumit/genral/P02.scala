package com.sumit.code
/*
Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
 */
object P02 {
  def main(args: Array[String]) {
   
    println(penultimate(List(1, 1, 2, 3, 5, 8)))
    println(penultimateUsingLibHelp(List(1, 1, 2, 3, 5, 8)))
  }
  
  def penultimate[T](ls: List[T]): T  =  ls match {
    case f::s::Nil => f
    case f::s::tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }
  
  def penultimateUsingLibHelp[T](ls:List[T]): T = 
    if(ls.size < 2)  
      throw new NoSuchElementException 
    else 
      //init returns except last
      ls.init.last
  
}