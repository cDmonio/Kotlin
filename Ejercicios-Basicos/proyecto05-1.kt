//Ejemplo sencillo de introducción de datos
fun main(argumento: Array<String>){

    print("Ingresar Primer Valor : ")
    //Introducción por teclado.
    val valor1 = readLine()!!.toInt()

    print("Ingresar Segundo Valor : ")
    //Introducción por teclado con readLine (en este momento es String) y le decimos que nos introduzca un (lo convertimos a entero)entero "toInt()"
    val valor2 = readLine()!!.toInt()

    // Creamos la Variable "suma" y le asignamos "valor1 + valor2"
    val suma = valor1+ valor2

    // Mostramos por Pantalla valor1 y valor2, y el resultado de la operación
    println ("La suma de $valor1 y $valor2 es $suma ")

    //Declaramos la variable producto y le asignamos el valor1 * valor2
    val producto = valor1 * valor2
    println() //salto de linea

    println("El producto de $valor1 y $valor2 es : $producto")
}
