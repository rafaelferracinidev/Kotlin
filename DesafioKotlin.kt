import kotlin.math.roundToInt

fun main() {
    println("Quantos cigarros você fuma por dia?")
    var dias = readLine()?.toIntOrNull() ?:0
    println("Quantos anos você fuma?")
    var anos = readLine()?.toIntOrNull() ?:0
    if (anos < 0){
        println("Você perde por dia ${dias * 10} minutos")

    }
    else {
        println("Você perdeu essa quantidade de dias por causa do fumo:")
        calculo(dias, anos)
    }

}

fun calculo(dias: Int, anos: Int): Double {
    var total = 0.0
    total = ((dias.toDouble() * 0.0069444583333) * (anos.toDouble() * 8766)) / 24
    println(total.roundToInt())
    return total
}