///Realizar un programa que lea por teclado cuatro valores numéricos enteros e informar su suma y promedio.

fun main (process: Array<String>){

    print("Ingrese Numero 1 : ")
    val numero1 = readLine()!!.toInt()
    print("Ingrese Numero 2 : ")
    val numero2 = readLine()!!.toInt()
    print("Ingrese Numero 3 : ")
    val numero3 = readLine()!!.toInt()
    print("Ingrese Numero 4 : ")
    val numero4 = readLine()!!.toInt()

    val sumaTotal = numero1 + numero2 + numero3 + numero4
    println()
    println("La suma de : $numero1 + $numero2 + $numero3 + $numero4 es : $sumaTotal")

    val promedio = sumaTotal / 4
    println()
    println("El promedio es : $promedio")
}