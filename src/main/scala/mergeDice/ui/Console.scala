package mergeDice.core

trait Console[F[_]] {

  def printLine: String => F[Unit]

  def readLine: String => F[String]

}

