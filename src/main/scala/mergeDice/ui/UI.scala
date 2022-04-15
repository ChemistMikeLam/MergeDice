package mergeDice.ui 

import mergeDice.data.Field 
import mergeDice.data.Field.* 
import mergeDice.data.Dices.* 

trait UI[F[_]] { self: Console[F] => 

  def printMainMenu: F[Unit] 

  def printGameField: Field => F[Unit] 

  def printDice: Dice => F[Unit] 

  def readChar: String => F[Char] 

  def readInt: String => F[Int] 

} 

