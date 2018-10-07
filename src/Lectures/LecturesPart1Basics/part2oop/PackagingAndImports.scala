package Lectures.LecturesPart1Basics.part2oop

import Playground.{Cinderella => Princess, PrinceCharming}
// import Playground._ - the _ character means import everything

import java.util.Date
import java.sql.{Date => SqlDate}


object PackagingAndImports extends App {

  // package members are accessible by their simple name
  val writer = new Writer("Jason", "How to be shit at everything", 1970)

  // import the package
  val princess = new Princess

  // package object
  sayHello
  println(speedOfLight)

  // imports
  val prince = new PrinceCharming

  // val date = Date
  // val sqlDate = SqlDate

  // default imports
  // java.lang contains String, Object, Exception
  // scala contains Int, Nothing, Function
  // scala.Predef contains println(), ???

}
