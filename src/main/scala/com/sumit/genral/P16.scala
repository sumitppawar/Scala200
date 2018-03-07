package com.sumit.code

/*

Drop every Nth element from a list.
Example:
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

 */
object P16 extends App {
  
  println(dropWithPureFunction(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  
  def drop[A](n:Int, ls: List[A]):List[A] = 
    if(ls.size < n) 
      ls
    else 
      ls.take(n-1) ::: drop(n, ls.drop(n))
    
   def dropWithPureFunction[A](n:Int, ls:List[A]): List[A] =
     (ls.zipWithIndex).filter {case (e,i) => (i+1) % n != 0} map(_._1)
}