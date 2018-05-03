object Products {
  def main(args: Array[String]) {
    val products = Map("ball" -> 100, "table" -> 1000)
    val productsWithDiscount = products.map { case (k, v) => (k, v * 0.9) }
    println(productsWithDiscount.get("ball"))
    println(productsWithDiscount.get("table"))
  }
}
