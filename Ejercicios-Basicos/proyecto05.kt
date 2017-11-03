//Asignamos peso a 3 personas, con F al final para decirle que es un Float, y en una 4ta variable lamada promedio guardamso su valo
fun main(argumento: Array<String>) {
    val peso1 = 89.4f
    val peso2 = 67f
    val peso3 = 87.45f
    val promedio = (peso1 + peso2 + peso3) / 3
    println("El promedio de los tres pesos de personas es $promedio")
}
