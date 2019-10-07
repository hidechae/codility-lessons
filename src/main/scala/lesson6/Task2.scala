package lesson6

object Task2 {
  def solution1(a: Array[Int]): Int = {
    val sorted = a.sorted
    Math.max(
      sorted(0) * sorted(1) * sorted.last,
      sorted(sorted.length - 1) * sorted(sorted.length - 2) * sorted(sorted.length - 3)
    )
  }

  def solution2(a: Array[Int]): Int = {
    val sorted = a.sorted
    Math.max(
      sorted match {
        case Array(v1, v2, v3, _ *) => v1 * v2 * v3
        case _ => 0
      },
      sorted match {
        case Array(v1, v2, _*, v3) => v1 * v2 * v3 // bad simple pattern
        case _ => 0
      },
    )
  }
}
