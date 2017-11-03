//Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas
// que se le realizaron y la cantidad de preguntas que contestó correctamente.
// Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje
// de respuestas correctas que ha obtenido, y sabiendo que:

/*
Nivel máximo:	Porcentaje>=90%.
Nivel medio:	Porcentaje>=75% y <90%.
Nivel regular:	Porcentaje>=50% y <75%.
Fuera de nivel:	Porcentaje<50%.
*/

fun main(parametro: Array<String>) {
    print("Ingrese la cantidad total de preguntas del examen:")
    val totalPreguntas = readLine()!!.toInt()
    print("Ingrese la cantidad total de preguntas contestadas correctamente:")
    val totalCorrectas = readLine()!!.toInt()
    val porcentaje = totalCorrectas * 100 / totalPreguntas;
    //Si es mayor o igual a 90 se cumple la condición si no pasamos a una 2da condición
    if ( porcentaje >= 90)
        println("Nivel máximo")

    else //si no
        // Si porcentaje es mayor de 75 o igual el nivel es medio si no, pasamos a la siguiente condición
        if (porcentaje >= 75)
            System.out.print("Nivel medio")

        else // si no
            //Si porcentaje es mayor o igual a 50 se cumple la condición
            if ( porcentaje >= 50)
                println("Nivel regular")

            else//Si no, es que es menos de 50. y fuera de nivel
                println("Fuera de nivel")
}