import io.circe.Json
import io.circe.syntax._



object ExtensionsDemo extends App{

    val map = Map(
      "foo" -> "bar",
      "foobar" -> "baz"
    )

  val json: Json = map.asJson
  println(json.spaces4)

}