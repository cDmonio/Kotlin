//Escribir un programa en el cual: dada una lista de tres valores enteros ingresados por teclado se guarde
//en otras dos variables el menor y el mayor de esa lista. Utilizar el if como expresión para obtener el mayor y el menor.
//Imprimir luego las dos variables.

fun main(parametro:Array<String>){
    print("Valor 1: ")
    val valor1 = readLine()!!.toInt()

    print("Valor 2: ")
    val valor2 = readLine()!!.toInt()

    print("Valor 3: ")
    val valor3 = readLine()!!.toInt()

    // Guardamos el menor de los 3 valores en la variable menor
    // si la primera parte de la condición se cumple a "menor" le asignamos valor1, si no así sucesivamente.
    val menor = if (valor1 < valor2 && valor1 < valor3) valor1 else if (valor2 < valor3) valor2 else valor3
    //Guardamos el mayor de los 3 valores en la variable mayor
    val mayor = if (valor1 > valor2 && valor1 > valor3) valor1 else if (valor2 > valor3) valor2 else valor3
    print("El mayor de la lista es $mayor y el menor $menor")
}