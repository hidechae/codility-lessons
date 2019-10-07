package lesson5

object Task1 {
  def solution1(a: Array[Int]): Int = {
    val MAX_PAIR_COUNT = 1000000000
    var countOfPair = 0
    var countOfEast = 0

    val b = new scala.util.control.Breaks
    b.breakable {
      a.foreach(e => {
        e match {
          case 0 => countOfEast += 1
          case 1 => countOfPair += countOfEast
          case _ =>
        }
        if (countOfPair > MAX_PAIR_COUNT) {
          countOfPair = -1
          b.break
        }
      })
    }

    countOfPair
  }

  def solution2(a: Array[Int]): Int = {
    val MAX_PAIR_COUNT = 1000000000
    var countOfPair = 0
    var countOfEast = 0

    for {
      e <- a if countOfPair != -1
    } {
      e match {
        case 0 => countOfEast += 1
        case 1 => countOfPair += countOfEast
        case _ =>
      }
      if (countOfPair > MAX_PAIR_COUNT) countOfPair = -1
    }
    countOfPair
  }
}
