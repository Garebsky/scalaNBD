import scala.collection.mutable.ListBuffer

object ZeroRemoval {
  def main(args: Array[String]) {
    val numList: List[Int] = List(10,0,4,3,1,0,0,0,4,13)
    println("before " + numList)
    removeZeros(numList)
  }
  def removeZeros(listNumbers:List[Int]){
    var numListWithoutZeros = new ListBuffer[Int]()
    for( i <- 0 to listNumbers.length -1){

      if(listNumbers(i) != 0) {
        numListWithoutZeros += listNumbers(i)
      }
    }
    println("after " + numListWithoutZeros)
    }
}
