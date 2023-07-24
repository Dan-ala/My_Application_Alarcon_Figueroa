package com.example.myapplication_alarcon_figueroa

class Reto1 {
}


fun main() {
    var dice1:Int = (1..6).random()
    var dice2:Int = (1..6).random()

    println("""
        Este es el juego de craps!
        Ganas si:
        1. Un par de unos en los dados
        2. Un total de tres en los dados
        3. Un total de once en los dados
        4. Si se obtiene dos o doce en los dados
        5. Un total de siete en los dados
    """.trimIndent())

    if (dice1==1 && dice2==1){
        println("Par de unos!")
    } else if(dice1==1 && dice2==3 || dice2==1 && dice1==2){
        println("Total de tres!!")
    } else if (dice1==5 && dice2==6 || dice2==5 && dice1==6){
        println("Total de once")
    } else if (dice1==2 || dice2==2 && dice1==6 || dice2==6){
        println("Se obtuvo un dos o un doce")
    } else if(dice1==4 && dice2==3 || dice2==4 && dice1==3){
        println("Total de siete")
    }
    else{
        println("USTED PIERDE!! Y OBTUVO EN EL DADO 1 $dice1 Y EN EL DADO 2 $dice2")
    }
}