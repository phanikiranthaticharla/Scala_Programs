object patternMatching {
  def main(args: Array[String]): Unit = {
    def greekAlphabet(letter:Char) = {
      letter match {
        case 'a' => "alpha"
        case 'b' => "beta"
        case _ => "Invalid character provided"
      }
    }
    var greekString = greekAlphabet('a')
    println(greekString)



  }
}
