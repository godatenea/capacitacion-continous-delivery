import Saludador.{RespuestaSaludo, Saludo}
import akka.actor.Actor
import akka.actor.Actor.Receive

/**
  * Created by sis1pac on 20/02/2017.
  */
object Saludador {
  case class Saludo(name: String)
  case class RespuestaSaludo(respuesta: String)
}

class Saludador extends Actor {
  override def receive: Receive = {
    case Saludo(name) =>
      sender ! RespuestaSaludo(s"Hello ${name}")
  }
}
