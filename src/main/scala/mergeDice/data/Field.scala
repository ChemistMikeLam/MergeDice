package mergeDice.data 

object Field {

  def apply(size: Int): Field = ???

  opaque type Coord = (Int, Int)

  object Coord { 

    def apply(x: Int, y: Int): Coord = ???

    def x: Int = ???

    def y: Int = ???

  }

}

class Field private[Field] (
    val size: Int,
    val field: Map[Field.Coord, Option[Dices.Dice]],
) {

  private[mergeDice] def copy(size: Int, field: Map[Field.Coord, Option[Dices.Dice]]): Field = ???

}

