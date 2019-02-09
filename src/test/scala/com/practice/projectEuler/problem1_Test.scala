package com.practice.projectEuler

import org.junit.Assert.assertTrue
import org.junit.Test
import com.practice.projectEuler.Problem1.sumOfdivisableBy3And5

@Test
class problem1_Test {

  /**
    * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    *
    * Find the sum of all the multiples of 3 or 5 below 1000.
    */
  @Test
  def problem1Test = {
    assertTrue(Problem1.sumOfdivisableBy3And5(1000)==233168)
  }

}
