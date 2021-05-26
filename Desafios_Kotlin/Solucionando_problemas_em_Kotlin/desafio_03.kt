/* Desafio 3 - Primo Rápido */

fun main(args: Array<String>) {
  var sqrt: Long
  var count: Int

  for (i in 1..readLine()!!.toLong()) {
    val num = readLine()!!.toLong()
    sqrt = num
    count = 0
    sqrt = Math.sqrt(sqrt.toDouble()).toLong()

    for (j in 2..sqrt) {
      val a = (num / j).toLong()
      val b = a * j

      if (b == num) count++
    }
    if (count == 0) println("Prime") else println("Not Prime")
  }
}
