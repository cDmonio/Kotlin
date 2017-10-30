//Definir una variable inmutable con el valor 50 que representa el lado de un cuadrado,
// en otras dos variables inmutables almacenar la superficie y el perímetro del cuadrado.
//Mostrar la superficie y el perímetro por la Consola.

fun main(parametro:Array<String>){
    //en casos como sete no hace falta declarar la variable como Entera o String
    //ya que kotlin reconoce automáticamente que tipo de variable será, es muy recomendable declararla.
    // Esto es solo un ejemplo.
    
    val lado = 50
    val superficie = lado*4
    val perimetro = lado * lado

    println("La Superfie es : $superficie")
    println("El perímetro es : $perimetro")


}