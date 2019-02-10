package com.practice.projectEuler

import org.junit.Assert.assertTrue
import org.junit.Test

@Test
class Problem6_Test {

  /**
    * The sum of the squares of the first ten natural numbers is,
    *
    * 12 + 22 + ... + 102 = 385
    * The square of the sum of the first ten natural numbers is,
    *
    * (1 + 2 + ... + 10)2 = 552 = 3025
    * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
    *
    * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    */

  @Test
  def problem6_Test : Unit={

    assertTrue(Problem6.differenceBetweenSumofSquaresAndSquareofSum(100) ==25164150)

  }
}
