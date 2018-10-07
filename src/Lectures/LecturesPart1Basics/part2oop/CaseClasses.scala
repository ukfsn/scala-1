package Lectures.LecturesPart1Basics.part2oop

object CaseClasses extends App {
   case class Person( name: String, age: Int)

  // 1. Class params are promoted to fields

  val jim = Person("Jim", 34)

  println(jim.name)

  println(jim.toString)

  println(jim) // same as println(jim.toString)

  println(jim.hashCode())

  val jim2 = Person("Jim", 34)

  println(jim == jim2) // true as case class provides an equals implementation

  val jim3 = jim.copy(age = 45) // creates a new instance of class overriding the specified params

  println( jim == jim3) // false now because values are different

  // case classes have companion objects
  val thePerson = Person

  // factory methods in companion object
  val mary = Person("Mary", 23) // uses objects apply() method

  println(mary)

  // case classs are serializable
  // Akka needs serializable object instances

  // case classes have extractor patterns - can be used in pattern matches

  case object UnitedKingdom {
    def name: String = "The United Kingdom of Great Britain and Northern Ireland"
  }

  println(UnitedKingdom.name)

  /*
    Expand MyList to use case classes and case objects
   */

}
