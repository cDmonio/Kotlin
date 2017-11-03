//Crear programa que imprima en pantalla números del 1 al 100

fun main(parametro: Array<String>){
    var x = 1 //asignamos a x el 1, y como no tiene decimales el programa detecta que es "ENTERO"

    while (x<=100){ //como la X empieza siendo 1, repetirá hasta que x sea menor o igual que 100

        println(x)

        x= x+1 //Aquí incrementamos x+1 cada vez que sea Verdadera la condición incrementará su valor en +1.
    }

}