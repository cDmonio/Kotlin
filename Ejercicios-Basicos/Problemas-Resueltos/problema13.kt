//Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.

fun main (process:Array<String>){

    print("Numero 1 : ")
    val numero1 = readLine()!!.toInt()
    print("Numero 2 : ")
    val numero2 = readLine()!!.toInt()
    print("Numero 3 : ")
    val numero3 = readLine()!!.toInt()

    //Si numero1 es mayor que numero2 pasamos a la siguiente condición
    if (numero1>numero2)
        //una vez cumplida la condición siguiente, comprobamos si numero1 es mayor que numero3 si es mayor se cumple si no, >>
        if (numero1>numero3)
        print("$numero1 es el mayor de todos!")

        //>>Si no, numero3 es mayor que numero1 y numero2.
        else
        print("$numero3")

    else //Si no se ha cumplido la primera condición pasamos a este siguiente if
        if (numero2>numero3) //si numero2 es mayor que numero3, (en este punto nos olvidamos de numero1 ya que damos por hecho que es menor
        print("$numero2 es el mayor de todos!")
        //si no, numero3 es el mayor de todos.
        else print("$numero3 es el mayor de todos!")

}