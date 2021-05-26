/* Desafio 1 - O Jogo Matemático de Paula */

fun main(args: Array<String>) {
    
    for (i in 1..readLine()!!.toInt()) {
    
        var input = readLine()!!.toCharArray()
        var symbol = input[1].toString()
        var N1 = Character.getNumericValue(input[0]);
        var N2 = Character.getNumericValue(input[2]);
        
        if (N1 == N2) println(N2 * N1)
        else if(symbol.matches("[a-z]".toRegex())) println(N1 + N2)
        else println(N2 - N1)
    }
}
