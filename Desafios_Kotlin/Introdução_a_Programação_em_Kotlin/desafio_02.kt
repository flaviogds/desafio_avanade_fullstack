/* Desafio 2 - Números Ímpares */

fun main(args: Array<String>) {

    val input = readLine()!!.toInt()
    
    for( num in 1..input){
      if(num % 2 != 0) println(num)
    }
}

