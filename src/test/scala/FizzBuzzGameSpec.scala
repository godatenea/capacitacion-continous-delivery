import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by sis1pac on 21/02/2017.
  */
class FizzBuzzGameSpec extends FlatSpec with Matchers {

  behavior of "Fizz Buzz Game"

  val fizzBuzzGame = new FizzBuzzGame

  "Given multiples of 3" should "return Fizz" in {
    fizzBuzzGame.play(3) should be("Fizz")
    fizzBuzzGame.play(9) should be("Fizz")
  }

  "Given multiples of 5" should "return Buzz" in {
    fizzBuzzGame.play(5) should be("Buzz")
    fizzBuzzGame.play(10) should be("Buzz")
  }

  "Given multiples of 3 and 5" should "return FizzBuzz" in {
    fizzBuzzGame.play(15) should be("FizzBuzz")
    fizzBuzzGame.play(30) should be("FizzBuzz")
  }

  "Given any number that is not multiple of 3 or 5" should "return the same number" in {
    fizzBuzzGame.play(4) should be("4")
    fizzBuzzGame.play(44) should be("44")
  }

  "Given a number less or equal than 0" should "throw illegal argument exception" in {
    assertThrows[IllegalArgumentException] {
      fizzBuzzGame.play(0)
    }
    assertThrows[IllegalArgumentException] {
      fizzBuzzGame.play(-2)
    }
  }

}
