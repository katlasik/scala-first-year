import slick.jdbc.H2Profile.api._

class Students(tag: Tag) extends Table[(Int, String, Int)](tag, "STUDENTS") {
  def id = column[Int]("ID", O.PrimaryKey)
  def name = column[String]("NAME")
  def age = column[Int]("AGE")
  def * = (id, name, age)
}


object SlickDemo extends App {

  val students = TableQuery[Students]

  val db = Database.forConfig("h2mem1")

  val query = students
    .filter(_.name.endsWith("ski"))
    .filter(_.age > 20)
    .length
    .result

  db.run(query)

}
