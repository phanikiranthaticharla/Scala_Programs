import java.io.FileNotFoundException
import io.Source._
object exceptionHandling {
  def main(args: Array[String]) {
    try {
      for (line <- fromFile("somefile.txt").getLines()) {
        println(line);
      }
    } catch {
      case e: FileNotFoundException => println("File was not found");
      case _: Exception => println("Some other exception")
    }
  }
}
