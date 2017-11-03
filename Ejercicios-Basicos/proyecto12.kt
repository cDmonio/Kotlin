/*
Confeccionar un programa que pida por teclado tres notas de un alumno,
calcule el promedio e imprima alguno de estos mensajes:
Si el promedio es >=7 mostrar "Promocionado".
Si el promedio es >=4 y <7 mostrar "Regular".
Si el promedio es <4 mostrar "Reprobado".
*/

fun main (expression: Array<String>){


    print("Introduzca Nota 1 : ")
    val nota1 = readLine()!!.toInt()

    print("Introduzca Nota 2 : ")
    val nota2 = readLine()!!.toInt()

    print("Introduzca Nota 3 : ")
    val nota3 = readLine()!!.toInt()

    val promedio = (nota1+nota2+nota3) /3
    if (promedio>=7)
        println("Promocionado!, tienes de promedio un $promedio !")
    else if (promedio>=4)
        println("Regular!, tienes de promedio un $promedio !")
        else
        print("Has suspendido!, tienes de promedio un $promedio !")
}
