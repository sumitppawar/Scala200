package com.sumit.genral

import org.scalatest.{FlatSpec, Matchers}

class P19Spec extends FlatSpec with Matchers {
  "rotate" should "rotate a list N places to the left"  in {
    P19.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
  }

  it should "rotate a list N places to the left where N is less zero" in {
    P19.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }

  it should "return empty list for empty input list" in {
    P19.rotate(2, List.empty) should be (List.empty)
  }
}
