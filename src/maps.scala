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

    /**
     * Output:
     * Some(+91)
     * +91
     * +1
     * (India,+91)
     * (USA,+1)
     */

  }
}
