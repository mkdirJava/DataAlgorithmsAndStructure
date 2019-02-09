package com.practice.projectEuler

/**
  * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
  *
  * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  *
  * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
  */

object Problem2 {

  def calculateEvenFibonacciSequence(maxNumber:Int,previousNumber:Int =0,numberCounter:Int = 1):Integer={
    val currentIteration = previousNumber + numberCounter
    (currentIteration < maxNumber ) match{
      case true => {
        if(currentIteration % 2 == 0) {
          currentIteration + calculateEvenFibonacciSequence(maxNumber, numberCounter, currentIteration)
        }else{
          calculateEvenFibonacciSequence(maxNumber, numberCounter, currentIteration)
        }
      }
      case false => 0
    }


  }


}