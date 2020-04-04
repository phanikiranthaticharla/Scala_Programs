/**
 * Maps in Scala
 * @author Phani Kiran Thaticharla
 */

object maps {
  def main(args: Array[String]): Unit = {
    var countryCodes = Map("India" -> "+91", "USA" -> "+1")
    println(countryCodes.get("India"))
    println(countryCodes("India"))
    println(countryCodes("USA"))
    for((k,v) <- countryCodes) {
      println(k, v)
    }
    println("Better to use foreach instead of the above for loop")
    countryCodes.foreach(println)

    /**
     * Output:
     * Some(+91)
     * +91
     * +1
     * (India,+91)
     * (USA,+1)
     * Better to use foreach instead of the above for loop
     * (India,+91)
     * (USA,+1)
     */

  }
}
