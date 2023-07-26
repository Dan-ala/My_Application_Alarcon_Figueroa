package com.example.myapplication_alan

class Nequi {
}

fun main() {
    var choice = ""
    var vidas = 3
    val phoneNumber = 3014408183
    val password = 5198
    var saldoDisponible = 4500
    var userPhoneNumber: Long


    fun saca() {
        println(
            """
                Desea retirar en:
                1. Cajero
                2. Punto Físico
            """.trimIndent()
        )
        val choiceWithdrawal = readLine()!!.toInt()

        if (choiceWithdrawal == 1 || choiceWithdrawal == 2) {
            print("Usted va a retirar, ingrese el monto a retirar: ")
            val montoRetirar = readLine()!!.toInt()
            if (montoRetirar >= 2000) {
                print("Está seguro de que va a retirar $" + montoRetirar + "?: ")
                choice = readLine()!!.toString()
                if (choice == "yes") {
                    val codigoRetiro: Int = (123456..654321).random()
                    println("Su código de retiro es: $codigoRetiro \n")
                    saldoDisponible-=montoRetirar

                } else {
                    println("Operación cancelada")
                }
            } else {
                println("No te alcanza")

            }
        }

    }


    fun envia() {
        print("ingrese el numero de celular al cual envía el dinero: ")
        userPhoneNumber = readLine()!!.toLong()
        print("ingrese el valor a enviar: ")
        val montoEnviar = readLine()!!.toInt()

        if (saldoDisponible > montoEnviar) {
            saldoDisponible -= montoEnviar
            println("el dinero ha sido enviado y su saldo actual es: $saldoDisponible \n")
        } else {
            println("No es posible enviar el dinero")
        }

    }

    fun recarga() {
        print("ingrese el valor a ingresar: ")
        val montoIngresar = readLine()!!.toInt()

        print("desea realizar la recarga con un monto de $montoIngresar?: ")
        choice = readLine()!!.toString()
        if (choice == "yes") {
            saldoDisponible += montoIngresar
            print("Recarga exitosa, ahora su saldo actual es: $saldoDisponible \n")
        } else {
            println("Quizás en otro momento")
        }
    }



    for (i in 1..3) {
            print("ingrese su celular: ")
            userPhoneNumber = readLine()!!.toLong()
            print("Ingresa tu clave: ")
            val userPass = readLine()!!.toInt()

            if (userPhoneNumber == phoneNumber && userPass == password) {
                choice = "yes"
                break

        } else {
            vidas -= 1
            println(
                "¡Upps! Parece que tus datos de acceso\n" +
                        "no son correctos, Tienes $vidas más"
            )
        }

    }



    while (choice=="yes"){
        println("Bienvenido, su saldo disponible es $saldoDisponible")
        println("""
            Funcionalidades:
            1. Saca
            2. Envía
            3. Recarga
            4. Salir
        """.trimIndent())


    print("Qué acción desea realizar?: ")
    val menu = readLine()!!.toInt()
    if(menu==1){
        saca()
    }
    else if(menu==2){
        envia()
    }
    else if(menu==3){
        recarga()
    }
    else if(menu==4){
       println("Cierre")
        break
    }
    }
    println("Vuelva Pronto")
}