/**
 * An example for Sets
 * @author Phani Kiran Thaticharla
 */

object Sets {
  def main(args: Array[String]): Unit = {
    var computer = Set("CPU", "Memory", "Hard drive", "Keyboard", "Mouse")
    var optionalItems = Set("HeadPhones", "USB Stick")
    var combined = computer ++ optionalItems
    println(combined)
  }

}
