package mergeDice.random 

trait Random[F[_]] { 

  def setSeed(newSeed: Long): F[Unit] 

  def getSeed: F[Long] 

  def nextInt(min: Int, max: Int): F[Int] 

  def nextBoolean: F[Boolean] 

} 

