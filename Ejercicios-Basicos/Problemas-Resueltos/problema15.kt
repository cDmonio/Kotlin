//Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.

fun main (parameterName: Array<String>){

    print("Ingresar Dia : ")
    val dia = readLine()!!.toInt()

    print("Ingresar Mes : ")
    val mes = readLine()!!.toInt()

    if(dia==25 && mes==12)
        print("Es navidad, Que Bien!!")
    else
        print("No es navidad, la fecha introducida es: Dia: $dia, Mes: $mes.")
}
