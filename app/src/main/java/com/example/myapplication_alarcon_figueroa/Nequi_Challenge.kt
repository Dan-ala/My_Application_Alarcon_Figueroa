package com.example.myapplication_alarcon_figueroa

class Nequi_Challenge {
}

fun main() {
    var choice = "yes"
    var vidas=3
    var loggin = false

    while(choice=="yes" && vidas>0){

        val phoneNumber=3014408183
        val password="Thonan123"
        var saldoDisponible=4500
        var userPhoneNumber: Long

        fun saca(){
            while (true) {
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
                    if (montoRetirar > 2000) {
                        print("Está seguro de que va a retirar $" + montoRetirar + "?: ")
                        choice = readLine()!!.toString()
                        if (choice == "yes") {
                            val codigoRetiro: Int = (123456..654321).random()
                            print("Su código de retiro es: " + codigoRetiro)

                        }
                        else {
                            println("Operación cancelada")
                            break // Exit the loop since the action is cancelled
                        }
                    } else {
                        println("No te alcanza")

                    }
                }
            }
        }

        fun envia(){
            print("ingrese el numero de celular al cual envía el dinero: ")
            userPhoneNumber = readLine()!!.toLong()
            print("ingrese el valor a enviar: ")
            val montoEnviar = readLine()!!.toInt()

            if (saldoDisponible>montoEnviar){
                saldoDisponible -=montoEnviar
                print("el dinero ha sido enviado y su saldo actual es: $saldoDisponible")
            }else{
                println("No es posible enviar el dinero")
            }

        }

        fun recarga(){
            print("ingrese el valor a ingresar: ")
            val montoIngresar = readLine()!!.toInt()

            print("desea realizar la recarga con un monto de $montoIngresar?: ")
            choice = readLine()!!.toString()
            if (choice=="yes"){
                saldoDisponible+=montoIngresar
                print("Recarga exitosa, ahora su saldo actual es: $saldoDisponible")
            }else
            {
                println("Quizás en otro momento")
            }
        }



            if (!loggin){
                print("ingrese su celular: ")
                userPhoneNumber = readLine()!!.toLong()
                print("Ingresa tu clave: ")
                val userPass= readLine()!!.toString()

                if (userPhoneNumber==phoneNumber && userPass==password){
                    println("""
                    Bienvenido, su saldo disponible es: $saldoDisponible    
                    desea realizar alguna acción?:
                """.trimIndent())
                    choice= readLine()!!.toString()
                    if (choice=="yes"){
                        loggin=true
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
                    }
                }else{
                    vidas -= 1
                    println("¡Upps! Parece que tus datos de acceso\n" +
                            "no son correctos, Tienes $vidas más")
                }
            }

        }
    if (vidas==0){
        print("La cuenta ha sido bloqueada")
    }
}