package com.practice.projectEuler

import org.junit.Assert.assertTrue
import org.junit.Test

@Test
class Problem5_Test {

  /**
    * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    *
    * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    */

  @Test
  def problem5_Test : Unit={
    val startTime = System.currentTimeMillis()
    println(Problem5.smallestPossitiveNumberDivisablefrom1to20_recurssive())
    assertTrue(Problem5.smallestPossitiveNumberDivisablefrom1to20_recurssive() == 232792560)
    val finishTime = System.currentTimeMillis()
    println(s"Time taken for recursion ${finishTime - startTime}")
  }
}
