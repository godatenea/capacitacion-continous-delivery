/**
  * Created by sis1pac on 21/02/2017.
  */
class FizzBuzzGame {

  def play(number: Int): String = {
    require(number > 0, "Number must be greater than 0")
    if (number % 5 == 0 && number % 3 == 0) "FizzBuzz"
    else if (number % 5 == 0) "Buzz"
    else if (number % 3 == 1) "Fizz"
    else String valueOf number
  }

}
