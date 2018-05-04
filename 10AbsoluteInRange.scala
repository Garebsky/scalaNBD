import scala.collection.mutable.ListBuffer

object AbsoluteInRange {
  def main(args: Array[String]) {
    val numList: List[Double] = List(10.12,0.4,41,3,-1.19,0.92,-4.1234,13.23)
    absoluteInRange(numList)
  }
  def absoluteInRange(listNumbers:List[Double]){
    var numsAbsoluteInRange = new ListBuffer[Double]()
    for( i <- 0 to listNumbers.length -1){

      if(listNumbers(i) > -5 && listNumbers(i) < 12) {
        numsAbsoluteInRange += listNumbers(i).abs
      }
    }
    println("after " + numsAbsoluteInRange)
  }
}
