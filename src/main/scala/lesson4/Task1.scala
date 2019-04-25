package lesson4

object Task1 {
  def solution1(a: Array[Int]): Int = {
    val set: Set[Int] = a.toSet
    val n:   Int      = a.length
    if (set.size == n && set.max == n) 1 else 0
  }

  def solution2(a: Array[Int]): Int = {
    if (a.sorted.zipWithIndex.exists(v => v._1 != v._2 + 1)) 0 else 1
  }
}
