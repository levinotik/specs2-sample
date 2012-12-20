import org.specs2.mutable._

/**
 * Levi Notik
 * Date: 12/19/12
 */
class SortsSpec extends Specification {


  val reverseSortedArraySmall = 10 to 1 by -1 toArray
  val revorseSortedArrayLarge = 10000 to 1 by -1 toArray
  val reverseSortedArrayHuge = 100000 to 1 by -1 toArray

  val unsortedArraySmall = util.Random.shuffle((1 to 10 toArray).toList).toArray
  val unsortedArrayLarge = util.Random.shuffle((1 to 10000 toArray).toList).toArray
  val unsortedArrayHuge = util.Random.shuffle((1 to 100000 toArray).toList).toArray

  "The Array [3, 2, 1] " should {
    "become Array [1, 2, 3]" in {
      Sorts.insertionSort(Array(3, 2, 1)) must equalTo(Array(1, 2, 3))
    }
  }

  "The Array [10, 9...1] " should {
    "become Array [1, 2...10]" in {
      Sorts.insertionSort(reverseSortedArraySmall) mustEqual (reverseSortedArraySmall.reverse)
    }
  }

  "The Array [10000, 9999...1] " should {
    "become Array [1, 2...10000]" in {
      Sorts.insertionSort(revorseSortedArrayLarge) mustEqual (revorseSortedArrayLarge.reverse)
    }
  }

  "The Array [100000, 99999...1] " should {
    "become Array [1, 2...100000]" in {
      Sorts.insertionSort(reverseSortedArrayHuge) mustEqual (reverseSortedArrayHuge.reverse)
    }
  }

  "The unsorted Array [1..10]" should {
    "become Array [1,2..10]" in {
      Sorts.insertionSort(unsortedArraySmall) mustEqual (unsortedArraySmall.sortWith(_ < _))
    }
  }

  "The unsorted Array [1..10000]" should {
    "become Array [1,2..10000]" in {
      Sorts.insertionSort(unsortedArrayLarge) mustEqual (unsortedArrayLarge.sortWith(_ < _))
    }
  }

  "The unsorted Array [1..100000]" should {
    "become Array [1,2..100000]" in {
      Sorts.insertionSort(unsortedArrayHuge) mustEqual (unsortedArrayHuge.sortWith(_ < _))
    }
  }
}
