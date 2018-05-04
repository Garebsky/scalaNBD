object Tuple {

  def main(args: Array[String]) {
    val t = Tuple3(3, "abc", 5.5)
    printTuple(t)
  }
  def printTuple(tuple3:(Int,String,Double)){
    tuple3.productIterator.foreach(x => {
      println(x)
    })
  }
}


