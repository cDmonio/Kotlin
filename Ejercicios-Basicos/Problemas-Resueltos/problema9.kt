//Se ingresan por teclado 2 valores enteros.
// Si el primero es menor al segundo calcular la suma y la resta, luego mostrarlos, sino calcular el producto y la división.

fun main(process: Array<String>){
    print("Ingresar Numero 1 : ")
    val numero1 = readLine()!!.toInt()

    print("Ingresar Numero 2 : ")
    val numero2 = readLine()!!.toInt()

    if (numero1<numero2) {
        val suma = numero1 + numero2
        println("Vamos a Sumar por que el 1 es menor que el 2 : $suma")
        }
        else{
        println()
        println("Vamos a Dividir y Multiplicar por que numero2 es mayor que numero 1, así que se cumple numero2>numero1")
        val division = numero1 / numero2
        println("La Division es : $division")

        val multiplicacion = numero1 * numero2
        println("El producto es = $multiplicacion")
        }

}
