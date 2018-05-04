object KontoBank {
  def main(args: Array[String]) {
    var kont1 = new KontoBankowe()
    println(kont1._stanKonta)
    var kont2 = new KontoBankowe(500)
    println(kont2._stanKonta)
  }

  class KontoBankowe(val _stanKonta: Integer) {

    def stanKonta = _stanKonta

    def wplata(x: Integer) {

    }

    def wyplata(x: Integer) {

    }

    def this() {
      this(0)
    }

  }
}
