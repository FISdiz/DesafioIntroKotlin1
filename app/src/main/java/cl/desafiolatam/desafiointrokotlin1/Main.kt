package cl.desafiolatam.desafiointrokotlin1

fun main () {
    println("Mi nombre es ${miNombre()}")
    println("El resultado de la suma es ${sumaVariables()}")
    println("El resultado de la suma es ${sumaVariables2(4,6,8)}")
    println(caracteres())
    caracteres2("Talento Digital")
    println("Float = ${decimal()}")
    println("El valor maximo de Byte es ${byteMax()} \nEl valor maximo de Short es ${shortMax()}")
    println("El valor minimo de Int es ${intMin()} \nEl valor minimo de Long es ${longMin()}")
    println("El valor de Si es ${booleana()}")
    imprimiendoParametros("Android", "Kotlin")
    println("El iva corresponde a ${obtieneIVA(4990.0)}")
}

fun miNombre () : String {
    return "Felipe Salazar"
}

fun sumaVariables() : Int {
    val num1 = 10
    val num2 = 20
    val num3 = 30
    return num1+num2+num3
}

fun sumaVariables2 (num1: Int, num2: Int, num3: Int) : Int {
    return num1 + num2 + num3
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
    return Byte.MAX_VALUE
}

fun shortMax() : Short {
    return Short.MAX_VALUE
}

fun intMin() : Int {
    return Int.MIN_VALUE
}

fun longMin() : Long {
    return Long.MIN_VALUE
}

fun booleana() : Boolean{
    var si = true
    return si
}

fun imprimiendoParametros(palabra1 :String, palabra2 :String) {
    var sumachar = palabra1.length+palabra2.length
    println("La suma de caracteres de las palabras $palabra1 y $palabra2, es $sumachar")
}

fun obtieneIVA (monto :Double) : Double {
    return monto*0.19
}