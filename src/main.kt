fun main() {

  for (i in 6 downTo 1 step 2) {
    val name: String = "Marcio $i";
    val bankNumber: Int = 10 + i;
    var balance: Double = 0.0 + i;


    println("Titular da conta: $name");
    println("Número da conta: $bankNumber");
  }

//  when {
//    balance > 0.0 -> {
//      println("Saldo positivo")
//    }
//    balance == 0.0 -> {
//      println("Voce não tem dinheiro")
//    }
//    else -> {
//      println("Pobre")
//    }
//  } faz uma função igual ou semelhante o if

//  when {
//    balance == 0.0 -> println("Vc não tem dinheiro");
//    balance > 100 && balance < 200 -> println("vc quase tem dinheiro, saldo total de $balance");
//    balance > 200 -> println("Rico pra caraio, vc tem $balance");
//    else -> println("Número invalido burro")
//  }

//  when (val x = 11) {
//    in 1..10 -> println("$x is in the range");
//    else -> println("$x is out of the range")
//  }

}

fun conditionTesting(balance: Double) {
  if (balance < 200 && balance > 100) {
    println("Seu saldo atual é $balance, você precisa de mais dinheiro")
  } else if (balance >= 200 && balance < 300) {
    println("Seu saldo é de $balance e vc ta quase rico")
  } else if (balance == 0.0) {
    println("Saldo insuficiente na conta")
  } else {
    println("Número inválido")
  }
}

fun howToMakeFor() {
  for (i in 16 downTo 2 step 2) {
    println(i)
  }
}

fun arrTest(args: Array<String>) {
  println(args.contentToString())
}