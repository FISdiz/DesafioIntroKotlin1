package cl.desafiolatam.desafiointrokotlin1

fun main () {
    println("Mi nombre es ${miNombre()}")
    println("El resultado de la suma es ${sumaVariables()}")
    println("El resultado de la suma es ${sumaVariables2(4,6,8)}")
    println(caracteres())
    println(caracteres2("Talento Digital"))
    println("Float = ${decimal()}")
    println("El valor maximo de Byte es ${byteMax()} \nEl valor maximo de Short es ${shortMax()}")
    println("El valor minimo de Int es ${intMin()} \nEl valor minimo de Long es ${longMin()}")
    println("El valor de Si es ${booleana()}")
    println(imprimiendoParametros("Android", "Kotlin"))
    println("El iva corresponde a ${obtieneIVA(4990)}")
}

fun miNombre () : String {
    return "Felipe Salazar"
}

fun sumaVariables() : Int {
    val num1 = 10
    val num2 = 20
    val num3 = 30
    val result = num1+num2+num3
    return result
}

fun sumaVariables2 (num1: Int, num2: Int, num3: Int) : Int {
    var result = num1 + num2 + num3
    return result
}

fun caracteres() :String {
    val personaje = "Arataka Reigen"
    var letra = 'A'
    val nameLenght = personaje.length
    letra = 'N'
    return "La cantidad de caracteres son $nameLenght y su ultimo caracter es $letra"
}

fun caracteres2 (palabra: String) {
    var nameLenght = palabra.length
    var letraFinal = palabra.takeLast(1)
    println("La cantidad de caracteres son $nameLenght y su ultimo caracter es $letraFinal")
}

fun decimal() : Float {
    return 1.4F
}

fun byteMax() : Byte {
    val bMax = Byte.MAX_VALUE
    return bMax
}

fun shortMax() : Short {
    val sMax = Short.MAX_VALUE
    return sMax
}

fun intMin() : Int {
    val iMin = Int.MIN_VALUE
    return iMin
}

fun longMin() : Long {
    val lMin = Long.MIN_VALUE
    return lMin
}

fun booleana() : Boolean{
    var si = true
    return si
}

fun imprimiendoParametros(palabra1 :String, palabra2 :String) {
    var plenght1 = palabra1.length
    var plenght2 = palabra2.length
    println("La cantidad de caracteres de la palabra $palabra1 es $plenght1")
    println("La cantidad de caracteres de la palabra $palabra2 es $plenght2")
}

fun obtieneIVA (monto :Int) : Double {
    var iva : Double = monto*0.19
    return iva
}