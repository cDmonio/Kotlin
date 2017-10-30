//Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente.
// Mostrar lo que debe abonar el comprador.


fun main (parametro: Array<String>) {

    print("Ingresar el Precio del Artículo : ")
    //Le dedimos que por entrada nos convierta el String a Double para poder introducir decimales.
    val articuloPrecio = readLine()!!.toDouble();

    print("Ingresar la Cantidad del Artículo : ")
    val cantidadAr = readLine()!!.toInt();

    //Asignamos "articuloPrecio * cantidadAr" en "totalabonar"
    val totalabonar = articuloPrecio * cantidadAr

    //Mostramos el "totalabonar" por pantalla
    //Mostramos el "totalabonar" por pantalla
    println("Total a Abonar por el Ciente : $totalabonar")
}