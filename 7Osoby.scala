object Osoby {
  def main(args: Array[String]){
    var osoba1 = new Osoba("Gabriel", "Piwnik")
    var osoba2 = new Osoba("Jan", "Kowalski")
    var osoba3 = new Osoba("Mariusz", "Siemaszko")
    var osoba4 = new Osoba("Gabriel", "Michalewski")
    var osoba5 = new Osoba("Kamil", "Niematakiego")
    matchPerson(osoba1)
    matchPerson(osoba2)
    matchPerson(osoba3)
    matchPerson(osoba4)
    matchPerson(osoba5)
  }
  case class Osoba(val firstName: String, val lastName: String) {
  }

  def matchPerson(pers: Osoba): Unit = pers match {
    case Osoba("Gabriel", _) => println("Hejo! Gabriel")
    case Osoba(_, "Kowalski") => println("Dzień dobry Kowalski")
    case Osoba("Mariusz", _) => println("witaj Mariusz!")
    case _ => println("Nie ma takiego czlowieka ale cześć!")
  }

     // case class Osoba(imie: String, nazwisko: String)

}
