// Operadores lógicos (&&, ||) OR o AND

fun main(parametro: Array<String>) {

    print("Ingrese día:")
    val dia = readLine()!!.toInt()
    print("Ingrese mes:")
    val mes = readLine()!!.toInt()
    print("Ingrese Año:")
    val año = readLine()!!.toInt()

    //Si mes es 1 OR mes es 2 OR mes es 4
    if (mes == 1 || mes == 2 || mes == 3)
        print("Corresponde al primer trimestre");
}