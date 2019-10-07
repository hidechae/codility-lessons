package lesson6

import org.scalatest.FunSuite

class Task1Test extends FunSuite {

  test("solution1") {
    assert(Task1.solution1(Array(2, 1, 1, 2, 3, 1)) == 3)
  }
}
