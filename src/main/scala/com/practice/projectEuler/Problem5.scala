package com.practice.projectEuler
import util.control.Breaks._

/**
  * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
  *
  * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
  *
  */

object Problem5 {


  def isDivisableby1To20(number:Long):Boolean={
    var isDivisable = true
    breakable{
      for(counter <- 20 to 1 by -1 ) {
        number % counter == 0 match {
          case true =>
          case false => {
            isDivisable = false
            break()
          }
        }
      }
    }

    isDivisable
  }

  /**
    * There must be a way to do this faster than ~ 9-10 seconds
    */
  //def smallestPossitiveNumberDivisablefrom1to20=???

  def smallestPossitiveNumberDivisablefrom1to20_recurssive(counter :Long=1):Long={

    isDivisableby1To20(counter)match{
      case true => counter
      case false => smallestPossitiveNumberDivisablefrom1to20_recurssive( counter+1)
    }
  }

}
