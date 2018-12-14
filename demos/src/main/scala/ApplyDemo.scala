object ApplyDemo extends App {

  trait Factory

  class BikeFactory extends Factory
  class PlaneFactory extends Factory
  class CarFactory extends Factory



  object Factory {
    def apply(product: String): Factory = product match {
      case "rower" => new BikeFactory()
      case "samolot" => new PlaneFactory()
      case "samochód" => new CarFactory()
      case _ => throw new IllegalArgumentException("Nie wiem jak to produkować!")
    }
  }



  val factory =  Factory("samochód")
  println(factory)


}
