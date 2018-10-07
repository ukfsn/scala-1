package Lectures.LecturesPart1Basics

object Functions extends App {
  def aFunction( a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Jason", 22))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if ( n == 1 ) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Jason", 4))

  // WHEN YOU WANT TO LOOP, USE RECURSION

  def aFunctionWithSideEffects( aString: String): Unit = println(aString)

  def aBigFunction( n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int  = a + b

    aSmallFunction(n, n-1)

  }

  /*
    1. A greeting function ( name, age) => "Hi my name is $name and I am $age years old"
    2. A factorial function 1 * 2 * 3 * ... n
    3. Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n-1) + f(n-2)
    4. Test if a number is prime
   */

  def aGreetingFunction( name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }

  println(aGreetingFunction("Bob", 4))

  def FactorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * FactorialFunction(n-1)
  }

  println(FactorialFunction(5))

  def fibonacci( n: Int): Int = {
    if ( n <= 2 ) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  println(fibonacci(8))

  def isPrime(n: Int) : Boolean = {
    def isPrimeUntil( t: Int): Boolean =
      if ( t <= 1 ) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  /*println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37* 22))*/
}
