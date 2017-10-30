// IF Problema9 de Proyecto9
// Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".

fun main (process: Array<String>){
    print("Nota 1 : ")
    val nota1 = readLine()!!.toInt()

    print("Nota 2 : ")
    val nota2 = readLine()!!.toInt()

    print("Nota 3 : ")
    val nota3 = readLine()!!.toInt()

    //Cuando son más de 2 datos tenemos que ponerlos entre parentesis!
    val promedio = (nota1 + nota2 + nota3) / 3

    println("El promedio del Alumno es : $promedio")
    println()

    if (promedio>=7){
        println("Has Aprobado el Trimestre, enhorabuena!")
    }else {
        println("Estas supendido, estudia mas y no seas un Vago! ")
    }
}