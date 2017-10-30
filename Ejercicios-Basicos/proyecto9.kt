//IF compuesto : TRUE Y FALSE
//Importante! Sólo se realiza una actividad o FALSE o True, nunca se realizan ambas a la vez.

fun main(parametros: Array<String>){

    print("Ingresar Numero 1 : ")
    val numero1 = readLine()!!.toInt()

    print("Ingresar Numero 2 : ")
    val numero2 = readLine()!!.toInt()

    println()
    //Comprobamos si el Numero 1 es mayor que > el Numero 2,
    // si es mayor mostramos el siguiente texto, si no, "else" (numero2>numero1) el "Numero 2" es mayor que > "Numero 1"
    if (numero1>numero2)
        println("El Numero 1: $numero1 es mayor que Numero 2: $numero2")
   else
        println("El Numero 2: $numero2 es mayor que Numero 1: $numero1")


}