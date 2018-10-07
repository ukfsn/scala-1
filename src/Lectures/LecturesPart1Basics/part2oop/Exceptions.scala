package Lectures.LecturesPart1Basics.part2oop

object Exceptions extends App {

  val x: String = null

  // println(x.length)
  // ^^ will crash with NullPointerException

  // Throwing exceptions

  // val aWeirdValue: String = throw new NullPointerException

  // throwable classes extend the Throwable class
  // Exception and Error are the major Throwable subtypes
  // Exception: something that went wrong with the program - eg Null pointer
  // Error: something that went wrong with the system - eg Stack overflow in JVM

  // Catching Exceptions
  def getInt(withException: Boolean): Int =
    if (withException) throw new RuntimeException("No Int for you!")
    else 42

  // try is an evaluation that returns either the outcome of try or catch blocks but NOT the finally block
  // finally block is optional
  // finally is typically only used for side effects such as logging

  val potentialFail = try {
    // code that might fail
    getInt(true)
  } catch {
    case e: RuntimeException => println("Caught a runtime exception")
  } finally {
    println("Code that will get executed no matter what!")
  }

  // how to define own exceptions
  class MyException extends Exception
  val exception = new MyException
  // throw exception

  // val OOM = throw new OutOfMemoryError() // output was clearly separate and after execution of above expressions
  // val SOError = throw new StackOverflowError() - output was interspersed with output from above expressions!

  class OverflowException extends RuntimeException("overflowed max value of type")
  class UnderflowException extends RuntimeException("underflowed min value of type")
  class MathCalculationException extends RuntimeException("Division by 0")

  class PocketCalculator {
    def add(x:Int, y:Int): Int = {
      val result = x + y
      // if ( result > Int.MaxValue ) throw new OverflowException // cannot use Int.MaxValue like this
      if ( x > 0 && y > 0 && result < 0 ) throw new OverflowException
      else if ( x < 0 && y < 0 && result > 0 ) throw new UnderflowException
      else result
    }

    def subtract(x: Int, y: Int): Int = {
      val result = x - y
      // if ( result < Int.MinValue ) throw new UnderflowException
      if ( x > 0 && y < 0 && result < 0) throw new OverflowException
      else if ( x < 0 && y > 0 && result > 0 ) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int): Int = {
      val result = x * y
      if ( x > 0 && y > 0 && result < 0 ) throw new OverflowException
      else if ( x < 0 && y < 0 && result > 0 ) throw new OverflowException
      else if ( x > 0 && y < 0 && result > 0 ) throw new UnderflowException
      else if ( x < 0 && y > 0 && result > 0 ) throw new UnderflowException
      else result
    }

    def divide(x: Int, y: Int): Int = {
      if (y == 0) throw new MathCalculationException
      x / y
    }
  }


  println(Int.MaxValue)
  val calc = new PocketCalculator
  println(calc.add(2,4))

  println( Int.MaxValue + 1 )

}
