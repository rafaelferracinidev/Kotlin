
// A função main é a que vai executar e printar as variaveis na tela.

fun main(args: Array<String>) {
    println(soma(2,3))
    println(soma(11))
    println(forca(2.0,4.0))
    println(forca(10.0))
}

//A função soma ira somar duas variaveis, adicionando o primeiro valor ao segundo.

fun soma(a: Int, b: Int = 1) : Int {
    return a + b
}

// A função forca ira multiplicar o valor "a" pelo valor "b" igual a formula F=m*a.

fun forca(a: Double, b: Double = 1.0) : Double {
    return a * b
}