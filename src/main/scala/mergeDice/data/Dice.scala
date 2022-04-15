package mergeDice.data 

object Dices { 

  opaque type Dice = Int 

  object Dice { 

    def apply(d: Int) = ??? 

  } 

  extension (d: Dice) 
    def next: Option[Dice] = ??? 

} 

