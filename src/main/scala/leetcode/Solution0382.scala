package leetcode

import scala.util.Random

/**
 * Definition for singly-linked list.
 * class ListNode(var _x: Int = 0) {
 *   var next: ListNode = null
 *   var x: Int = _x
 * }
 */
class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
/** @param _head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
class Solution0382(_head: ListNode) {

//  lazy val length: Int = {
//    @scala.annotation.tailrec
//    def getLength(node: ListNode, l: Int = 0): Int = {
//      node.next match {
//        case null => l
//        case v    => getLength(v, l + 1)
//      }
//    }
//    getLength(_head)
//  }

  lazy val seq: Seq[Int] = {
    @scala.annotation.tailrec
    def toSeq(node: ListNode, s: Seq[Int] = Nil): Seq[Int] =
      node.next match {
        case null => s :+ node.x
        case v    => toSeq(v, s :+ node.x)
      }
    toSeq(_head)
  }

  /** Returns a random node's value. */
  def getRandom(): Int = {
    seq(Random.nextInt(seq.length))
  }

}
/**
 * Your Solution object will be instantiated and called as such:
 * var obj = new Solution(head)
 * var param_1 = obj.getRandom()
 */