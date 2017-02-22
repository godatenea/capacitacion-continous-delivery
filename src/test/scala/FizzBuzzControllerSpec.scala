import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{Matchers, WordSpec}

/**
  * Created by sis1pac on 21/02/2017.
  */
class FizzBuzzControllerSpec extends WordSpec with Matchers with ScalatestRouteTest {

  val route = FizzBuzzController.route

  "The controller of Fizz Buzz" should {

    "return FizzBuzz's value for get requests to fizzbuzz path in html format with heading tag" in {
      Get("/fizzbuzz/7") ~> route ~> check {
        responseAs[String] shouldEqual "<h1>7</h1>"
      }
    }

  }
}
