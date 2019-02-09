package com.practice.projectEuler

import org.junit.Assert.assertTrue
import org.junit.Test

@Test
class problem3_Test {

  /**
    * The prime factors of 13195 are 5, 7, 13 and 29.
    *
    * What is the largest prime factor of the number 600851475143 ?
    */
  @Test
  def problem3Test = {
    val startTime = System.currentTimeMillis()
    assertTrue(Problem3.getLargestPrimeFactor(600851475143l) == 6857 )
    val timeTaken = System.currentTimeMillis() -startTime
    println(s"recursion took ${timeTaken}")
  }

  @Test
  def problem3TestByStream = {
    println(Problem3.getLargestPrimeFactorByStream(600851475143l))
    val startTime = System.currentTimeMillis()
    assertTrue(Problem3.getLargestPrimeFactorByStream(600851475143l) == 6857 )
    val timeTaken = System.currentTimeMillis() -startTime
    println(s"Streaming took ${timeTaken}")
  }

  @Test
  def problem3_primeNumber_Test():Unit={
    println(Problem3.isPrimeNumber(15))
  }

}
