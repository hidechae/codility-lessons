package leetcode

object Solution1217 {

  /**
   * 偶数同士、奇数同士はcost0でまとめられるのでまとめてしまって、
   * 少ない方を移動させれば良い
   */
  def minCostToMoveChips(chips: Array[Int]): Int = {
    val grouped: Map[Int, Array[Int]] = chips.groupBy(_ % 2)
    val evenCount = grouped.getOrElse(0, Array()).length
    val oddCount  = grouped.getOrElse(1, Array()).length
    Math.min(evenCount, oddCount)
  }
}
