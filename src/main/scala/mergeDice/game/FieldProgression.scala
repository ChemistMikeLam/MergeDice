package mergeDice.game 

import mergeDice.data.* 

import cats.data.StateT 

type FieldState[F[_], A] = StateT[F, Field, A] 

trait FieldProgression[F[_]] { 

  def addDice(d: Dices.Dice): FieldState[F, Unit] 

  def mergeDices(active: List[Field.Coord]): FieldState[F, Unit] 

} 

