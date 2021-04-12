fun main() {
  println("Welcome to bytebank")
  val countMarcio = BankCount()
  val countOther = BankCount()

  countMarcio.name = "Marcio"
  countMarcio.balance = 104.56
  countOther.name = "Other"
  countOther.balance = 109.92

  println("Welcome ${countMarcio.name}, your balance is ${countMarcio.balance}")
  println("Welcome ${countOther.name}, your balance is ${countOther.balance}")
}

class BankCount {
  var name: String = "";
  var countNumber: Number = 0;
  var balance: Double = 0.0;


}