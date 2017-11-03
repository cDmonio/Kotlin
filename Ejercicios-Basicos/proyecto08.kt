//Ejercicio IF aprendiendo IF simple sin FALSE, Solo TRUE.
/*¿Elijo la carrera A o la carrera B?
¿Me pongo este pantalón?
Para ir al trabajo, ¿elijo el camino A o el camino B?
Al cursar una carrera, ¿elijo el turno mañana, tarde o noche?
*/

//Ejemplo: Ingresar el sueldo de una persona, si supera los 3000 pesos
// mostrar un mensaje en pantalla indicando que debe abonar impuestos.


fun main(parametro: Array<String>){

    print("Ingrese el sueldo del empleado:")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000) {
        println("Debe pagar impuestos")
    }

    /* Si sólo tuvieramos una instruccion, (Una sola condición) este código sin llaves tambien sería correcto
            if (sueldo > 3000)
        println("Debe pagar impuestos")
     */

}
