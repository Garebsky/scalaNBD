object PlusOneList {
  def main(args: Array[String]) {
    val numList: List[Int] = List(10,0,4,3,1,0,0,0,4,13)
    addOne(numList)
  }
  def addOne(listNumbers:List[Int]){
    var listWithPlusOne: List[Int] = List()
    listWithPlusOne = listNumbers.map(a => a+1)
    println(listWithPlusOne)
  }
}
