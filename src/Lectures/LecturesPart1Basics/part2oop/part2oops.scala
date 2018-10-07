package Lectures.LecturesPart1Basics.part2oop

import org.w3c.dom.css.Counter

object part2oops extends App {
  val Person = new Person("John", 26)
  Person.greet("Bob")

  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val count = new Counter
  count.print
  count.inc.print
  count.inc.inc.inc.print
  count.inc(10).print

}

class Person (name: String, age: Int) {
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")
}

class Writer (firstName: String, surname: String, val yearOfBirth: Int) {
  def fullname(): String = firstName + " " + surname
}

class Novel (name: String, yearOfRelease: Int, author: Writer) {
  def authorAge = yearOfRelease - author.yearOfBirth

  def isWrittenBy(author: Writer)  = author == this.author

  def copy(newYear: Int): Novel = new Novel(this.name, newYear, this.author)
}

class Counter (val count: Int = 0) {
  def inc = new Counter(count + 1)
  def dec = new Counter(count - 1)

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if ( n <= 0 ) this
    else dec.dec(n-1)
  }

  def print = println(count)
}