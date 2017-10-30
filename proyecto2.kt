fun main(parametro: Array<String>) {
    //Esto es una variable inmutable (local) no se pueden cambiar su asignación
    val valor1: Int
    val valor2: Int
    valor1 = 100
    valor2 = 400

    //esto es una variable mutable (podemos cambiar su valor sin necesidad de tener que cambiarla a 0 etc.
    var resultado: Int

    // a resultado le añadimos el valor de 1 y de 2 y lo sumamos
    resultado = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $resultado")

    //a resultado le añadimos el valor de 1 y 2 y lo multiplicamos al ser una variable mutable
    // no guarda el valor anterior de "resultado", nos guarda un valor nuevo.
    resultado = valor1 * valor2
    println("El producto de $valor1 * $valor2 es $resultado")
}