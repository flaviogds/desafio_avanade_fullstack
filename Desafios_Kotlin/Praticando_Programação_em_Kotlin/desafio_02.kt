/* Desafio 2 - Conversão Simples de Base */

fun main(args: Array<String>) {

    var input: String
    val reg = """0[xX].*""".toRegex()

    while (true) {
        input = readLine()!!

        if (input.matches(reg)) {
            input = input.toUpperCase().replace("0X", "")
            println(toDecimal(input))
        }
        else {
            var dec = input.toInt()
            if (dec < 0) break else println(toHexa(dec))
        }
    }
}

fun toDecimal(hex: String): Int {
    val base: Double = 16.toDouble()
    var decimal: Int = 0

    for ((index, value) in hex.withIndex()) {
        var exp: Double = (hex.length - index - 1).toDouble()
        var str: String = value.toString()
        decimal += (convertToNum(str) * Math.pow(base, exp)).toInt()
    }
    return decimal
}

fun toHexa(input: Int): String {
    var hex: String = ""
    var dec: Int = input

    if (dec < 16) hex += convertToSymbol(dec)
    else {
        while (dec > 0) {
            hex = convertToSymbol(dec % 16) + hex
            dec = dec / 16
        }
    }
    return "0x$hex"
}

fun convertToNum(str: String): Int {
    var reg = "[0-9]".toRegex()
    var num: Int = 0
    when (str) {
        "A" -> num = 10
        "B" -> num = 11
        "C" -> num = 12
        "D" -> num = 13
        "E" -> num = 14
        "F" -> num = 15
        else -> {
            if (str.matches(reg)) num = str.toInt()
        }
    }
    return num
}

fun convertToSymbol(dec: Int): String {
    var symbol: String = ""
    when (dec) {
        in 0..9 -> symbol = dec.toString()
        10 -> symbol = "A"
        11 -> symbol = "B"
        12 -> symbol = "C"
        13 -> symbol = "D"
        14 -> symbol = "E"
        15 -> symbol = "F"
    }
    return symbol
}
