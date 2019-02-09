package com.practice.projectEuler

/**
  * The prime factors of 13195 are 5, 7, 13 and 29.
  *
  * What is the largest prime factor of the number 600851475143 ?
  *
  * Wl: So key is the only looping to the square root, this cuts prime number computation by 50%
  * There is a liner growth of the item to be calculated for prime number
  * so if the square root was not in place computation requirements grows exponentially
  *
  * Thought: is there a way to do this in terms of streams?
  *   You can do it via streaming however it is significantly slower, probably easier to craft though
  *   and easier to read
  */

object Problem3 {

  def isPrimeNumber(number:Long):Boolean={
    number > 2 && !(2 to Math.sqrt(number).intValue()).exists(counter => number % counter == 0)
  }
  def isFactorial(number:Long , denominator: Long) = number %denominator ==0


  def getLargestPrimeFactor(numberInQuestion:Long, counter:Long = 3) :Long ={

    isFactorial(numberInQuestion, counter) && isPrimeNumber(counter) match{
      case true => {
          val nextPrimeNumber = getLargestPrimeFactor(numberInQuestion, counter +2)
          if( nextPrimeNumber > counter ) nextPrimeNumber else counter
      }
      case false =>{
        if(Math.sqrt(numberInQuestion) > counter ){
          getLargestPrimeFactor(numberInQuestion, counter +2)
        }else{
          0
        }
      }
    }
  }

  /**
    * You kind of can use filtering
    * @param numberInQuestion
    * @return
    */
  def getLargestPrimeFactorByStream(numberInQuestion:Long)={
    3 to Math.sqrt(numberInQuestion).intValue() by 2 filter (counter => isPrimeNumber(counter) && isFactorial(numberInQuestion,counter)) max
  }


}

