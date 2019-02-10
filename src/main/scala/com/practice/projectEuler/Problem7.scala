package com.practice.projectEuler

import scala.collection.mutable

/**
  * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
  *
  * What is the 10 001st prime number?
  */

object Problem7 {

  def isPrimeNumber(number:Long):Boolean={
    number == 2 || number > 2 && !(2 to Math.sqrt(number).intValue()).exists(counter => number % counter == 0)
  }

  def primeNumberGenerator(indexOfPrimeNumber:Long, primeNumberFoundList:mutable.MutableList[Long]= mutable.MutableList.empty, counter:Long=1): Long ={

    primeNumberFoundList.length == indexOfPrimeNumber match{
      case true =>primeNumberFoundList(indexOfPrimeNumber.intValue() -1 )
      case false =>{
        isPrimeNumber(counter)match{
          case true => {
            primeNumberFoundList += counter
            primeNumberGenerator(indexOfPrimeNumber,primeNumberFoundList,counter+1)
          }
          case false => primeNumberGenerator(indexOfPrimeNumber,primeNumberFoundList,counter+1)
        }
      }
    }

  }


}
