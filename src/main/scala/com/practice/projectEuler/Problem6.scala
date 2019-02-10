package com.practice.projectEuler

object Problem6 {

  def findSumOfSquares(number:Int):Long={
    val squares:Long = 1 to number reduce {
      (acc,i) => acc + i*i
    }
    squares
  }

  def findSquareofSum(maxLimit:Int):Long={
    val sum:Long = 1 to maxLimit reduce {
      (acc,i) => acc + i
    }
    sum*sum
  }

  def differenceBetweenSumofSquaresAndSquareofSum(number:Int): Long ={
    findSquareofSum(number) - findSumOfSquares(number)
  }


}
