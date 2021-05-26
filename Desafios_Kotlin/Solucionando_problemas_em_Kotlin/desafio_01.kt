/* Desafio 1 - Taxa de Imposto de Renda */

fun main(args: Array<String>) {
    var input = readLine()!!.toDouble()
    var tax : Double = 0.0

    if(input > 4500.0){
        tax += (input - 4500)*0.28
        input = 4500.0
    }
    if(input > 3000.0){
        tax += (input - 3000)*0.18
        input = 3000.0
    }
    if(input > 2000.0) tax += (input - 2000)*0.08

    if(tax.compareTo(0).equals(0)){
        println("Isento")
    }
    else{
        println("R$ ${String.format("%.2f", tax)}")
    }
}

