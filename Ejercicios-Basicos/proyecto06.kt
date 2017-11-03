//Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo
// (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)

fun main (parametro: Array<String>){
    print("Ingresar la medida del lado del cuadrado : ")
    //Aquí creamos la variable inmutable lado y le asignamos un readline toInt, (lo ingresado por pantalla se almacenará en Lado.
    val lado = readLine()!!.toInt()
    val perimetro = lado * 4
    println("El perímetro del Cuadrado de lado ($lado), es : $perimetro")

}
