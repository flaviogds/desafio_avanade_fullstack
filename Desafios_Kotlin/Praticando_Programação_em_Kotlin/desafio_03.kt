/* Desafio 3 - Bob Conduite */

fun main(args: Array<String>) {
    
    for (i in 1..readLine()!!.toInt()) {
    
        var input = readLine()!!.split(" ")

        var R1 = input[0].toInt();
        var R2 = input[1].toInt();
        
        var Rmin = R1 + R2
        
        println(Rmin)
    }
}
