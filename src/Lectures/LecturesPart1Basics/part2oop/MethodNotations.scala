package Lectures.LecturesPart1Basics.part2oop

object MethodNotations extends App {
  class Person(val name: String, favouriteMovie: String, val age: Int = 1) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"My name is ${this.name}!!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi my name is ${this.name} and I like $favouriteMovie"
    def +(s: String): Person = new Person(s"${name} (${s})", favouriteMovie)
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def learns(skill: String): String = s"$name learns $skill"
    def learnsScala(): String = this.learns("Scala")
    def apply(n: Int): String = s"$name watched $favouriteMovie $n times"

  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")

  val tom = new Person(name = "Tom", "Fight Club")

  println(mary hangOutWith tom)

  println( ! mary)

  println( mary isAlive)

  println( mary() )

  val maryRS = mary + "The Rockstar"
  println(maryRS())

  val maryPlus = +mary
  println(maryPlus.age)

  println(mary learnsScala)

  println(mary(2))

}

