package com.practice.projectEuler

import org.junit.Assert.assertTrue
import org.junit.Test

@Test
class Problem7_Test {

  /**
    * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    *
    * What is the 10 001st prime number?
    */

  @Test
  def problem7_Test : Unit={

    assertTrue(Problem7.primeNumberGenerator(10001) == 104743)

  }
}
