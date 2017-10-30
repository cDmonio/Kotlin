//Escribir un programa en el cual se ingresen cuatro números enteros, calcular e informar la suma de los dos primeros
// y el producto del tercero y el cuarto.

fun main (parametro: Array<String>){

    print("Ingrese Numero 1 : ")
    val numero1 = readLine()!!.toInt()
    print("Ingrese Numero 2 : ")
    val numero2 = readLine()!!.toInt()

    println() //salto de Linea
    print("Ingrese Numero 3 : ")
    val numero3 = readLine()!!.toInt()
    print("Ingrese Numero 4 : ")
    val numero4 = readLine()!!.toInt()

    //Hacemos la suma y la mostramos por pantalla
    println()
    val suma = numero1 + numero2
    println ("La Suma de : $numero1 y $numero2 es : $suma")
    //Hacemos la multiplicacion y la mostramos por pantalla
    val multiplicar = numero3 * numero4
    println("El proudcto de : $numero3 y $numero4 es : $multiplicar")
}