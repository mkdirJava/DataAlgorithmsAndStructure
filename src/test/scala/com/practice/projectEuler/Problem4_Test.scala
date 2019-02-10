package com.practice.projectEuler

import org.junit.Assert.assertTrue
import org.junit.Test

@Test
class Problem4_Test {

  /**
    * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    *
    * Find the largest palindrome made from the product of two 3-digit numbers.
    */

  @Test
  def isPalindromic_true_Test : Unit={
    assertTrue(Problem4.isPlandromNumber(101))
  }
  @Test
  def isPalindromic_false_Test : Unit={
    assert(Problem4.isPlandromNumber(100) ==false)
  }

  @Test
  def problem4Test:Unit={
    val startTime = System.currentTimeMillis()
    assertTrue(Problem4.largestPalendromFrom3DigitNumber == 906609)
    val finishTime = System.currentTimeMillis()
    println(s"Time taken for non recurstion ${finishTime - startTime}")
  }
  @Test
  def largestPalendromFrom3DigitNumberRecusrion_Test:Unit={
    val startTime = System.currentTimeMillis()
    assertTrue(Problem4.largestPalendromFrom3DigitNumberRecusrion() == 906609)
    val finishTime = System.currentTimeMillis()
    println(s"Time taken for recursion ${finishTime - startTime}")
  }



}
