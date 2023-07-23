package com.example.myapplication_alarcon_figueroa

class Arrays_Challengue {
}

fun main() {

    val cars = mutableListOf("Chevrolet","Mazda","Toyota")
    println("desea ingresar un nuevo auto? ")
    var choice:String = readln()!!.toString()
    while (choice=="yes"){

        println("ingresa el nuevo auto: ")
        var newCar:String = readLine()!!.toString()
        cars.add(newCar)

            println("desea buscar un auto? ")
            choice = readln()!!.toString()

            if (choice=="yes"){
                print("ingrese el nombre del auto: ")
                val nombre:String = readLine()!!.toString()

                for (element in cars){
                    if(nombre==element){
                        println("el auto $nombre está en la lista y en la posición "+cars.lastIndexOf(nombre))
                    }
                    else{
                        println("No se encuentra dentro de la lista")
                    }

                }
                }


        choice+1

        }
}