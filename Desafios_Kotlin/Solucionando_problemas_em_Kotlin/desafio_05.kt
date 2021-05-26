
/* Desafio 5 - Figurinhas */

fun main(args: Array<String>) {
    for (i in 1..readLine()!!.toInt()) {
      val input = readLine()!!.split(" ").map { it.toInt() }
      
      println(mdc(input[0], input[1]))
    }
}

fun mdc(num1: Int, num2: Int): Int {
  if(num1 == num2) return num1
  
  var rest = 0
  var valueA = num1
  var valueB = num2
  
  while(valueB != 0){
    rest = valueA % valueB;
    valueA = valueB;
    valueB = rest;
  }
  return valueA;
}