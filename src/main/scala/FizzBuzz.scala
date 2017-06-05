case class FizzBuzz() {

  def generate(start: Int, end: Int): String = {
    if (start > end) s"Invalid range: $start is higher than $end"
    else fizzBuzzList(start, end).mkString(" ")
  }

  private def fizzBuzzList(start: Int, end: Int): List[String] = {
    (start to end map { number =>
      (number % 5, number % 3) match {
        case (0, 0) => "fizzbuzz"
        case (0, _) => "buzz"
        case (_, 0) => "fizz"
        case _      => number.toString
      }
    }).toList
  }

}
