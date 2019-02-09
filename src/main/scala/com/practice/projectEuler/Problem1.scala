package com.practice.projectEuler

/**
  * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  *
  * Find the sum of all the multiples of 3 or 5 below 1000.
  */
object Problem1 {

  def divisableBy3 (number:Int):Boolean = number % 3 == 0
  def divisableBy5 (number:Int):Boolean = number % 5 == 0

  def sumOfdivisableBy3And5 (maxNumber:Int, numberIteration:Int = 0):Int={

    numberIteration < maxNumber match{
      case true =>{
        if(divisableBy3(numberIteration) || divisableBy5(numberIteration) ){
          numberIteration + sumOfdivisableBy3And5(maxNumber,numberIteration+1)
        }else{
          sumOfdivisableBy3And5(maxNumber,numberIteration+1)
        }
      }
      case false => 0
    }

  }

}
