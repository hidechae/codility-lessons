package lesson4

import org.scalatest.{ BeforeAndAfterEach, FunSuite }

class Task1Test extends FunSuite with BeforeAndAfterEach {

  override def beforeEach() {

  }

  override def afterEach() {

  }

  test("testSolution1") {
    assert(Task1.solution1(Array(4, 1, 3, 2)) == 1)
    assert(Task1.solution1(Array(4, 1, 3)) == 0)
  }

  test("testSolution2") {
    assert(Task1.solution2(Array(4, 1, 3, 2)) == 1)
    assert(Task1.solution2(Array(4, 1, 3)) == 0)
  }

}
