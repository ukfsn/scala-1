package Lectures.LecturesPart1Basics

object Strings extends App {
  val str: String = "Hello, I am leaning Scala"

  println(str.charAt(2))

  println(str.substring(7, 11))

  println(str.split(" ").toList)

  println(str.startsWith("Hello"))
  println(str.endsWith("Bob"))

  println(str.replace(" ", "-"))

}
