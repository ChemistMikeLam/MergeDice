package mergeDice.game

import mergeDice.ui.UI
import mergeDice.random.Random
import mergeDice.data.*

import cats.data.StateT

type GameState[F[_], A] = StateT[F, Game, A]

class GameProgression[F[_]] private[GameProgression] (
    val uif: UI[F],
    val rand: Random[F],
    val fp: FieldProgression[F],
) {

  def genDice: GameState[F, Unit] = ???

  def placeDice: GameState[F, Unit] = ???

  def printGameState: GameState[F, Unit] = ???

}

object GameProgression {

  def apply[F[_]](
      uif: UI[F],
      rand: Random[F],
      fp: FieldProgression[F],
  ): GameProgression[F] = ???

}
