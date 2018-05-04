object PatternMatch {
  def main(args: Array[String]): Unit = {
    println(matchDay("poniedziałek"))
    println(matchDay("sobota"))
    println(matchDay("xyz"))
  }

  def matchDay(x: String): String = x match {
    case "poniedziałek" => "praca"
    case "wtorek" => "praca"
    case "środa" => "praca"
    case "czwartek" => "praca"
    case "piątek" => "praca"
    case "sobota" => "weekend"
    case "niedziela" => "weekend"
    case _ => "Nie ma takiego dnia"
  }
}
