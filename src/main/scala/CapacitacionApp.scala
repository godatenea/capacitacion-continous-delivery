import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.Http.ServerBinding
import akka.stream.ActorMaterializer
import akka.util.Timeout

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.io.StdIn

/**
  * Created by sis1pac on 20/02/2017.
  */
object CapacitacionApp extends App {

  implicit val system = ActorSystem("capacitacion")
  implicit val ec = system.dispatcher
  implicit val timeout = Timeout(5 seconds)
  implicit val materializer = ActorMaterializer()

  val bindingFuture: Future[ServerBinding] = Http().bindAndHandle(FizzBuzzController.route, "localhost", 8081)

  println(s"Server online at http://localhost:8081/\nPress RETURN to stop...")
  StdIn.readLine() // let it run until user presses return
  bindingFuture
    .flatMap(_.unbind()) // trigger unbinding from the port
    .onComplete(_ => system.terminate()) // and shutdown when done

}
