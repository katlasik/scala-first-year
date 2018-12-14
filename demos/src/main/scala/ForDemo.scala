import scala.collection.mutable

object ForDemo extends App{

  val females = List(
    "Ania",
    "Agnieszka",
    "Kasia",
    "Joasia"
  )

  val adjectives = List(
    "wesoła",
    "smutna",
    "tańcząca"
  )


  val femalesWithAdjectives = for {
    female <- females
    adjective <- adjectives
  } yield {
    adjective + " " + female
  }

  println(ForDemo.femalesWithAdjectives)

  // =======

  val femalesWithAdjectives2 = mutable.ListBuffer[String]()

  for {
    female <- females
    adjective <- adjectives
  } {
    femalesWithAdjectives2.append(adjective + " " + female)
  }

  println(femalesWithAdjectives2.toList)

  // ===============

  for(i <- 1 to 20 by 3) {
    println(i)
  }

}
