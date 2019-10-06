package leetcode

// TODO

/**
 * Wrong Answer
 * RuntimeError
 */
object Solution1220 {
  def countVowelPermutation(n: Int): Int = {
    var list = Seq( 'a', 'i', 'u', 'e', 'o')

    for {
      _ <- 2 to n
    } list = list.flatMap(extend)

    list.length
  }

  def extend(c: Char): Seq[Char] = {
    c match {
      case 'a' => Nil :+ 'e'
      case 'i' => Nil :+ 'a' :+ 'u' :+ 'e' :+ 'o'
      case 'u' => Nil :+ 'a'
      case 'e' => Nil :+ 'a' :+ 'i'
      case 'o' => Nil :+ 'i' :+ 'u'
    }
  }
}

/**
 * Wrong Answer
 * maybe overflow for large input
 */
object Solution1220_2 {
  def countVowelPermutation(n: Int): Int = {
    var map: scala.collection.immutable.Map[Char, Int] = scala.collection.immutable.Map('a' -> 1, 'i' -> 1, 'u' -> 1, 'e' -> 1, 'o' -> 1)

    2.to(n).foreach(_ => map = extend(map))
    map.values.sum
  }

  def extend(map: scala.collection.immutable.Map[Char, Int]): Map[Char, Int] = {
    var res = scala.collection.immutable.Map('a' -> 0, 'i' -> 0, 'u' -> 0, 'e' -> 0, 'o' -> 0)
    for {
      c <- Seq( 'a', 'i', 'u', 'e', 'o')
    } {
      c match {
        case 'a' => res = inc(res, map(c), Seq('e'))
        case 'i' => res = inc(res, map(c), Seq('a', 'u', 'e', 'o'))
        case 'u' => res = inc(res, map(c), Seq('a'))
        case 'e' => res = inc(res, map(c), Seq('a', 'i'))
        case 'o' => res = inc(res, map(c), Seq('i', 'u'))
      }
    }
    res
  }

  @scala.annotation.tailrec
  def inc(map: scala.collection.immutable.Map[Char, Int], delta: Int, keys: Seq[Char]): scala.collection.immutable.Map[Char, Int] =
    keys match {
      case Nil => map
      case head +: tail =>
        inc(
          map + (head -> (map(head) + delta)),
          delta,
          tail
        )
    }
}
