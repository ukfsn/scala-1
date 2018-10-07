package Lectures.LecturesPart1Basics

object defaultArgs extends App {
  def factorial(n: Int, acc: BigInt = 1) : BigInt =
    if ( n <= 1 ) acc
    else factorial(n-1, n * acc)

  println(factorial(10))
}
