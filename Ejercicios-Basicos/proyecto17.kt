//Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno en uno.
//Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.

fun main(parametro: Array<String>){

    println("Introducir un Valor: ")
    val valor = readLine()!!.toInt()
    var x = 1

    //se cumple el bucle mientras X sea menor que el valor introducido!
    while (x <=valor) {
        println("Número $x de $valor")
        x=x+1 //x++
    }

}