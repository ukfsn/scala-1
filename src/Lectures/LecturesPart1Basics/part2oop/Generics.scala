package Lectures.LecturesPart1Basics.part2oop

object Generics extends App {
  class MyList[+A] {
    def add[B >: A](element: B): MyList[B] = ???

  }

  class MyMap[Key, Value] {

  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // generic methods

  object MyList {
    def empty[A]: MyList[A] = ???

  }

  val emptyListOfIntegers = MyList.empty[Int]

  class Animal
  class Cat extends Animal
  class Dog extends Animal



}
