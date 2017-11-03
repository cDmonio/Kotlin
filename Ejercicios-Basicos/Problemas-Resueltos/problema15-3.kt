//Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero).
//Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
// (1º Cuadrante si x > 0       Y      y > 0 ,
// 2º Cuadrante: x < 0 Y y > 0, etc.)

fun main (parametro: Array<String>){
    print("Ingresar coordenada X : ")
    val coordX = readLine()!!.toInt()

    print ("Ingresar Coordenada Y : ")
    val coordY = readLine()!!.toInt()

    //Si la coordenadaX e Y, es positiva y mayor que 0 entonces
    if(coordX>0 && coordY>0)
        println("Se encuentra en el primer cuadrante X: $coordX , Y: $coordY ")
    else //Si no

        if (coordX<0 && coordY>0) //Ejemplo: X: -8, Y: +8
        println("Se encuentra en el segundo cuadrante  X: $coordX , Y: $coordY")
        else//Si no

            if (coordX<0 && coordY<0) //Ejemplo: X: -5 , Y: -8
            println("Se encuentra en el tercer cuadrante X: $coordX , Y: $coordY")

            else//Si no
                if(coordX>0 && coordY<0) //Ejemplo: X: 5, Y: -8
                    println("Se encuentra en el cuarto cuadrante X: $coordX , Y: $coordY")

                else //Ejemplo: X:0, Y:0
                    println("Se encuentra en un eje X: $coordX , Y: $coordY\"")

}