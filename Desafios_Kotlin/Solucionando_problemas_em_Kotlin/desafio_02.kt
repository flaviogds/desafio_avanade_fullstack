/* Desafio 2 - Área do Círculo */

fun main(args: Array<String>) {
    
    val radius = readLine()!!.toDouble()
    val pi = 3.14159
    val area = pi * radius * radius
    
    println("A=${String.format("%.4f", area)}")
}