package Lectures.LecturesPart1Basics.part2oop

object AbstractDataTypes extends App {
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch")
  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded {

  }

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I am a croc and I am eating ${animal.creatureType}")
  }

  val dog = new Dog
  val crocodile = new Crocodile

  crocodile.eat(dog)


}
