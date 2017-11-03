//Si utilizamos if como expresiones podemos codificar el mismo programa en forma más concisa con el siguiente código:

fun main(parametros: Array<String>) {

    print("Ingrese primer nota:")
    val nota1 = readLine()!!.toInt()

    print("Ingrese segunda nota:")
    val nota2 = readLine()!!.toInt()

    print("Ingrese tercer nota:")
    val nota3 = readLine()!!.toInt()

    val promedio = (nota1 + nota2 + nota3) / 3

    //Asignamos la Condición a la variable estado.
    val estado = if (promedio >= 7) "Promocionado" else if (promedio >= 4) "Regular" else "Libre"
    //Llamamos a la variable que tiene la condición y mostramos la condición por pantalla
    print("Estado del alumno $estado")
}