package lesson6

object Task1 {
  def solution1(a: Array[Int]): Int =
    a.foldLeft(Map.empty[Int, Boolean])((acc, v) =>  acc + (v -> true)).keys.toSeq.length

  def solution2(a: Array[Int]): Int =
    a.distinct.length
}
