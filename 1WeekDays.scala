object WeekDays_1 {
  // List of Strings
  val weekDays: List[String] = List("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela")
  def main(args: Array[String]) {
  //  println("Hello, world!") // prints Hello World
    forWeekDays(weekDays)
    forWeekDaysOnP(weekDays)
    forEachWeekDays(weekDays)
    whileWeekDays(weekDays)
    println("\n Dni tygodnia rekurencja :\n ")
    recurWeekDays(weekDays)
    println("\n Dni tygodnia rekurencja odwrócona :\n ")
    recurWeekDaysReversed(weekDays)
    println("\n Dni tygodnia fold left :\n ")
    foldLeftWeekDays(weekDays)
    println("\n Dni tygodnia fold right :\n ")
    foldRightWeekDays(weekDays)
    println("\n Dni tygodnia fold left na p :\n ")
    foldLeftWeekDayonP(weekDays)
  }

  def forWeekDays(dayList:List[String]){
    println("\n Dni tygodnia: \n")
    var i = 0;
    // for loop execution with a range
    for( i <- 0 to dayList.length -1){
      println(dayList(i))
    }
  }

  def forWeekDaysOnP(dayList:List[String]){
    println("\n Dni na p: \n")
    var i = 0;

    // for loop execution with a range
    for( i <- 0 to dayList.length -1){

      if(dayList(i).charAt(0) == 'p') {
        println(dayList(i))
      }
    }
  }

  def forEachWeekDays(dayList:List[String]){
    println("\n Dni tygodnia forEach: \n")
    dayList.foreach(println)
  }

  def whileWeekDays(dayList:List[String]): Unit ={
    println("\n Dni tygodnia while :\n ")
      // Local variable declaration:
      var i = 0;

      // while loop execution
      while( i < dayList.length){
        println( dayList(i) );
        i = i + 1;
      }
    }

  def recurWeekDays(dayList:List[String]) {

    if(! dayList.isEmpty) {
      println(dayList.head)
      recurWeekDays(dayList.tail)
    }
  }

  def recurWeekDaysReversed(dayList:List[String]) {

    if(! dayList.isEmpty) {
      println(dayList.reverse.head)
      recurWeekDays(dayList.reverse.tail)
    }
  }

  def foldLeftWeekDays(dayList:List[String]) {
    println(s"Week days \n ${dayList.foldLeft("")((a, b) => a + b + "\n")}")
  }

  def foldRightWeekDays(dayList:List[String]) {
    println(s"Week days \n ${dayList.foldRight("")((a, b) => a + "\n" + b)}")
  }

  def foldLeftWeekDayonP(dayList:List[String]) {
    //println(s"Week days \n ${dayList.foldLeft("")((a, b) => a + b + "\n")}")
    println(s"Week days \n ${dayList.foldLeft("")((a, b) => if ((b.charAt(0) == 'p' )) a + b + "\n" else a + "" )}")
  }
}
