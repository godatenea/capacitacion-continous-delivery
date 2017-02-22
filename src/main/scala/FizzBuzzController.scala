import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.Directives._

/**
  * Created by sis1pac on 21/02/2017.
  */
object FizzBuzzController {

  val fizzBuzzGame = new FizzBuzzGame()

  val route =
    get {
      pathEndOrSingleSlash {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, s"<h1>Welcome to FizzBuzz Game</h1>"))
      } ~
      path("fizzbuzz" / IntNumber) { number =>
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, s"<h1>${fizzBuzzGame.play(number)}</h1>"))
      }
    }


}
