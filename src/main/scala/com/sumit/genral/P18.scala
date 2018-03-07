package com.sumit.code
/*

Extract a slice from a list.
Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
Example:

scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)

 */
object P18 extends App {
  
  println(sliceUsingZipIndex(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  
  //BuiltIn
  def sliceBuiltIn[A](i:Int, k:Int, ls:List[A]): List[A] = ls.slice(i, k)
  
  //Using Lib Classe
  def slice[A](i:Int, k:Int, ls:List[A]): List[A] = ls.drop(i).take(k-i)
  
  //Using Lib Classe
  def sliceUsingZipIndex[A](i:Int, k:Int, ls:List[A]): List[A] = 
    (ls zipWithIndex).filter {case (e,index) => index>=i && index < k }.map(_._1)
  
}