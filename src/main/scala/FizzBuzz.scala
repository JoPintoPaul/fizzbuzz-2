case class FizzBuzz() {

  def generate(start: Int, end: Int): String = {
    if (start > end) s"Invalid range: $start is higher than $end"
    else fizzBuzzList(start, end).mkString(" ")
  }

  private def fizzBuzzList(start: Int, end: Int): List[String] = {
    (start to end map {
      case luckyNumber if luckyNumber.toString.contains("3") => "lucky"
      case nonLuckyNumber =>
        (nonLuckyNumber % 5, nonLuckyNumber % 3) match {
          case (0, 0) => "fizzbuzz"
          case (0, _) => "buzz"
          case (_, 0) => "fizz"
          case _      => nonLuckyNumber.toString
        }
    }).toList
  }

}
