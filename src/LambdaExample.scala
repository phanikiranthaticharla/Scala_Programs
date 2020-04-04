object LambdaExample {
  def main(args: Array[String]): Unit = {
    val max = (x:Int, y:Int) => if(x > y) x else y
    println(max(2,5))
  }
}
