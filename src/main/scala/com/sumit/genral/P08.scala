package com.sumit.code

/*
Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */
object P08 extends App {

  println(compresV2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
 
  //Functional 
  def compress[A](ls: List[A]): List[A] = ls.foldRight(List[A]()) {(h,r) => 
    if(r.isEmpty || h != r.head)  
      h::r
    else
      r
  }
  
  //Without tail R
  def compresV2[A](ls: List[A]): List[A] = ls match {
    case Nil => ls
    case a::Nil => ls
    case a:: tail => a :: compress(tail.dropWhile(_ == a))
  }
    
}
