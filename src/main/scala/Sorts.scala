/**
 * Levi Notik
 * Date: 12/19/12
 */
object Sorts {

  def insertionSort(array: Array[Int]): Array[Int] = {

    for (j <- 1 until  (array.length)) {
      val key = array(j)
      var i = j - 1

      while(i>=0 && array(i)>key) {
        array(i+1) = array(i)
        i = i - 1
      }

      array(i+1) = key
    }

    array
  }



}
