/* Desafio 3 - Quadrado e ao Cubo */

fun main(args: Array<String>) {

    var input = readLine()!!.toInt()
    
    val calcPow = { n: Int, e: Int -> Math.pow(n.toDouble(), e.toDouble()).toInt() }

    for (num in 1..input) println("${num} ${calcPow(num, 2)} ${calcPow(num, 3)}") 
}
