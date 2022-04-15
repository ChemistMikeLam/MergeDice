package mergeDice.data 

class Game private[mergeDice] (val field: Field) { 

  def copy(field: Field): Game = ??? 

} 

object Game { 

  def apply(size: Int): Game = ??? 

} 

