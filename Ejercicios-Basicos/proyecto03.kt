//Variables concisas en kotlin, podemos asignarle valor directamente, sin escribir tanto codigo.
fun main(parametro: Array<String>) {
    val valor1: Int = 100 //Declaramos valor1 como entero y le damos el valor de 100 (variable inmutable)
    val valor2: Int = 400 //Declaramos valor2 como entero y le damos el valor de 400 (variable inmutable)

    var resultado: Int = valor1 + valor2 //Aquí directamente a resultado (variable mutable) la declaramos y le asignamos la suma
                                         //De valor1+valor2.

    println("La suma de $valor1 + $valor2 es $resultado")

    resultado = valor1 * valor2 //A resultado (variable mutable) le asignamos el valor del producto (resultado ya estaba declarado antes
                                //Como variable mutable.
    println("El producto de $valor1 * $valor2 es $resultado")
}
