package com.sumit.code
/*

Find out whether a list is a palindrome.
Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true

 */
object P06 extends App {
  
  println(isPalindrome(List(1, 2, 3)))
  
  def isPalindrome[T](ls: List[T]): Boolean = ls match {
    case Nil => true
    case s:: Nil => true
    case s::tail if s == tail.last => isPalindrome(tail.init) 
    case s:: tail if s != tail.last => false
  }
  
  //Two time traversing
  def isPalindromeV2[T](ls:List[T]): Boolean  = ls == ls.reverse
}