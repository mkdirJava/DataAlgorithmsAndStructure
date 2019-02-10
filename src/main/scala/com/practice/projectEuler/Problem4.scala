package com.practice.projectEuler

import util.control.Breaks._

import scala.collection.mutable

/**
  * A palindromic number reads the same both ways.
  * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
  *
  * Find the largest palindrome made from the product of two 3-digit numbers.
  */
object Problem4 {


  def isPlandromNumber(number: Long): Boolean = {
    number.toString.reverse.equals(number.toString())
  }

  def largestPalendromFrom3DigitNumber = {
    var arr: mutable.MutableList[Long] = mutable.MutableList.empty;

    for (outerCounter <- 999 to 0 by -1) {
      breakable{
        for (innerCounter <- 999 to 0 by -1) {
          var mul = innerCounter * outerCounter;
          if (isPlandromNumber(mul)) {
            arr += mul;
            break
          }
        }
      }
    }

    arr.max
  }


  def largestPalendromFrom3DigitNumberRecusrion (counter:Long =999):Long= {

    if(counter == 0 ){
      0
    }else{
      var largestpalendromNumberInCycle: Long = 0

      breakable{
        for(denominator:Int <- 999 to 0 by -1 ){
          val iterationCalculation = denominator * counter
          isPlandromNumber(iterationCalculation)match{
            case true => {
              largestpalendromNumberInCycle = if(largestpalendromNumberInCycle > iterationCalculation) largestpalendromNumberInCycle else iterationCalculation
              break
            }
            case false =>
          }
        }
      }
      val nextPalendromNumber = largestPalendromFrom3DigitNumberRecusrion(counter -1)
      if( largestpalendromNumberInCycle > nextPalendromNumber ) largestpalendromNumberInCycle else nextPalendromNumber
      }
    }
}
