package com.CristianArango.myapplication

class Reto_Loops {
}

fun main() {
    println("Bienvenido al Supermercado Noé, estamos premiando gente, bueno... Dependiendo su suerte")
    var opcion:String="yes"
    var sumatotal:Double=0.0
    while (opcion=="yes") {
        print("Ingrese el nombre del producto: ")
        var producto: String = readLine()!!
        print("Ingrese el valor del producto: ")
        var valor = readLine()!!.toDouble()
        print("Ingrese la cantidad: ")
        var cantidad = readLine()!!.toDouble()
        print("Desea agregar otro producto? Type: yes or no: ")
        opcion = readLine()!!
        var operacion=valor*cantidad
        sumatotal+=operacion
    }
    if(sumatotal>=50.000){
        print("Vamos a mirar su suerte...")
        var bolita:Int=(1..4).random()
            if (bolita==1){
                var bolitaroja:Double=sumatotal/10
                 sumatotal+=-bolitaroja
                println("cayo la bolita ROJA, tiene un 10% de descuento su saldo es $sumatotal")

                print("Plz pay in cash. Enter your money: ")
                var moneyUsu:Double= readLine()!!.toDouble()
                if (moneyUsu>sumatotal){
                    var r1: Double = moneyUsu-sumatotal
                    print("Your exchange is: $r1")
                }else{
                    print("There's not enough money.")
                }

            }else if( bolita==2){
                var  bolitaazul: Double =sumatotal*0.30f
                var valorpagarbolitaazul: Double =sumatotal-bolitaazul
                println("cayo la bolita AZUL, tiene un 30% de descuento su saldo es $valorpagarbolitaazul")

                print("Plz pay in cash. Enter your money: ")
                var moneyUsu2= readLine()!!.toDouble()
                if (moneyUsu2>sumatotal){
                    var r2: Double = moneyUsu2-sumatotal
                    print("Your exchange is: $r2")
                }else{
                    print("There's not enough money.")
                }

            }else if( bolita==3){
                var  bolitaAmarilla: Double =sumatotal/2
                println("cayo la bolita AMARILLA, tiene un 50% de descuento su saldo es $bolitaAmarilla")

                print("Plz pay in cash. Enter your money: ")
                var moneyUsu3= readLine()!!.toDouble()
                if (moneyUsu3>sumatotal){
                    var r3: Double = moneyUsu3-sumatotal
                    print("Your exchange is: $r3")
                }else{
                    print("There's not enough money.")
                }

            }else{
                print("Felicitaciones callo la bolita BLANCA, SU COMPRA ES GRATIS!!")
            }
        }
    else{
        print("Deberá pagar el mismo saldo del producto")

        println("Plz pay in cash. Enter your money: ")
        var moneyUsu4= readLine()!!.toDouble()
        if (moneyUsu4>sumatotal){
            var r4: Double = moneyUsu4-sumatotal
            print("Your exchange is: $r4")
        }else{
            print("There's not enough money.")
        }
    }

}