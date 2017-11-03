//Confeccionar un programa que lea por teclado tres números y nos muestre el mayor.

fun main(parametro: Array<String>) {

    print("Ingrese primer valor:")
    val num1 = readLine()!!.toInt()

    print("Ingrese segundo valor:")
    val num2 = readLine()!!.toInt()

    print("Ingrese tercer valor:")
    val num3 = readLine()!!.toInt()

    //Si numero1 es mayor que numero2 pero también es mayor que numero3 entonces
    if (num1 > num2 && num1 > num3)
        print(num1) //mostrar numero1

    else //si no
        if (num2 > num3)
            print(num2)
        else
            print(num3);
}

