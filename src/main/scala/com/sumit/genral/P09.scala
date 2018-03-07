package com.sumit.code

/*
Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.
Example:

scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
 */

object P09 extends App {
  
  println(packV2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  
  def pack[A](ls:List[A]):List[List[A]] = ls match {
    case Nil => Nil
    case e :: tail => List(List(e) ::: tail.takeWhile(_ == e)) ::: pack(tail.dropWhile(_ == e))
  }
  
  def packV2[A](ls: List[A]): List[List[A]] = 
    if(ls.isEmpty)
      List(List())
      else  {
    	      val (pack, r) = ls.span(_ == ls.head)
    	      if(r == Nil) List(pack) 
    	      else 
    			    pack :: packV2(r)
      }
}