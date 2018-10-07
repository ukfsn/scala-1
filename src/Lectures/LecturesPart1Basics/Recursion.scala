package Lectures.LecturesPart1Basics

object Recursion extends App {
  def factorial (n: Int): Int =
    if ( n <= 0 ) 1
    else n * factorial(n-1)

  println(factorial(10))

  def anotherFactorial( n: Int ): BigInt = {
    def helper( x: Int, accumulator: BigInt): BigInt =
      if ( x <= 1 ) accumulator
      else helper(x - 1, x * accumulator)

    helper( n, 1)
  }

  println(anotherFactorial(10))

  println(anotherFactorial(400))

  /*
    1. Concatenate a string n times
    2. IsPrime - tail recursive
    3. Fibonacci - tail recursive
   */

  def concatString( s: String, n: Int ): String = {
    def stringHelper( s: String, n: Int, accummulator: String) : String =
      if ( n <= 1 ) accummulator
      else stringHelper(s, n-1, s + accummulator)

    stringHelper(s, n, s)
  }

  println(concatString("Jason", 5))

  def fibonacci( n: Int ): BigInt = {
    def fibHelper(n: Int, prev: BigInt, next: BigInt ): BigInt =
      if ( n <= 1 ) next
      else fibHelper(n-1, next,  next + prev )

    fibHelper(n, 0, 1)
  }

  println(fibonacci(8))

  def recursive_fibonacci( n: Int, prev: BigInt = 0, next: BigInt = 1): BigInt =
    if ( n <= 1) next
    else recursive_fibonacci(n-1, next, next + prev)

  println(recursive_fibonacci(8))
}
