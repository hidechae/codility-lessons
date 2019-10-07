package lesson6

import org.scalatest.FunSuite

class Task2Test extends FunSuite {

  test("solution1") {
    assert(Task2.solution1(Array(-3, 1, 2, -2, 5, 6)) == 60)
  }

  test("solution2") {
    assert(Task2.solution2(Array(-3, 1, 2, -2, 5, 6)) == 60)
  }
}
