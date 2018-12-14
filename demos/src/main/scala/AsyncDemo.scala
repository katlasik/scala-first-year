import scala.concurrent.ExecutionContext.Implicits.global
import scala.async.Async.{async, await}
import scala.concurrent.Future
import scala.util.Success

object AsyncDemo {

  def fetchNewUsers() = Future.successful(List("Janek", "Piotrek"))

  def fetchNewUsersCars(users: List[String]) = Future.successful(List("Ford", "Audi"))



  val result1 = fetchNewUsers().onComplete{
    case Success(users) => {
      if(users.nonEmpty) {
        fetchNewUsersCars(users).onComplete{
          case Success(cars) => //.....
        }
        // ...
      } else {
        // ..
      }

    }
  }




  val result2 = async {

    val users = await(fetchNewUsers())
    if (users.nonEmpty ) {
      val cars = await(fetchNewUsersCars(users))
    } else {
      0
    }

  }

}
