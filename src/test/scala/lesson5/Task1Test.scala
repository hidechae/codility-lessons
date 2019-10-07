package lesson5

import org.scalatest.FunSuite

class Task1Test extends FunSuite {

  test("solution1") {
    assert(Task1.solution1(Array(0, 1, 0, 1, 1)) == 5)
  }

  test("solution2") {
    assert(Task1.solution2(Array(0, 1, 0, 1, 1)) == 5)
  }
}
