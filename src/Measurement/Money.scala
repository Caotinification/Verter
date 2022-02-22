package Measurement
import scala.collection.immutable.BitSet.empty.ordering
import scala.collection.mutable

object Money {
  def MakeChange(cents: Int): mutable.SortedMap[Int, Int] = {
    var centCount: Int = cents
    val coins: mutable.SortedMap[Int, Int] = mutable.SortedMap.empty(ordering.reverse)
    for (x <- COINS) { // cashier's algorithm
      val quotient: Int = centCount/x
      centCount = centCount - quotient * x
      coins += (x -> quotient)
    }
    coins
  }
  private val COINS = Array(25,10,5,1)
}
