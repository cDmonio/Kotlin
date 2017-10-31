//Cargar dos valores enteros, almacenar el mayor de los mismos en otra variable y mostrarlo.

fun main(parametro: Array<String>) {

    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()

    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()

    //Como vemos podemos guardar la operación en una variable Llamada Mayor
    val mayor = if (valor1 > valor2) valor1 else valor2

    //Mostramos la operación
    println("El mayor entre $valor1 y $valor2 es $mayor")
}

