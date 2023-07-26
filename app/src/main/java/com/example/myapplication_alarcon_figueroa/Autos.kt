package com.example.myapplication_alan

class arrays {
}

fun main() {

    val cars = mutableListOf<String>()
    var choice = "yes"
    var choice2=""

    while (choice=="yes"){

        print("desea ver el menú de inicio?: Type yes: ")
        choice2 = readLine()!!.toString().uppercase()
        if (choice2=="YES"){
            println("""
                        1. Ingresar un nuevo auto
                        2. Mostrar todos los autos
                        3. Buscar un auto
                        4. Modificar un auto
                        5. Eliminar un auto
                    """.trimIndent())


            print("Qué acción desea realizar?, Ingrese el número correspondiente: ")
            val menu:Int = readLine()!!.toInt()
            if (menu==1){
                println("Ingresa el nuevo auto (aquí se valida si el auto existe): ")
                var newCar:String = readLine()!!.toString().lowercase()
                for ((index, element) in cars.withIndex()){
                    if(newCar==element){
                        println("el auto $element está en la lista y en la posición $index")
                    }
                }
                print("Ingrese un nuevo auto: ")
                newCar= readLine()!!.toString().lowercase()
                cars.add(newCar)

            }
            else if(menu==2){
                println("Los autos son: $cars")
            }
            else if(menu==3){
                print("Ingrese el nombre del auto: ")
                var nombre:String = readLine()!!.toString().lowercase()

                for ((index, element) in cars.withIndex()){
                    if(nombre==element){
                        println("el auto $element está en la lista y en la posición $index")
                    }
                    else{
                        println("$nombre No se encuentra dentro de la lista en la posición $index, ingrese otro nombre: ")
                        nombre = readLine()!!.toString().lowercase()
                        if(nombre==element){
                            println("el auto $element está en la lista y en la posición $index")
                        }
                    }
                }
            }
            else if(menu==4){
                println("La lista de autos es esta: $cars")
                print("Ingrese el nombre del auto a modificar: ")
                var modiCar:String = readLine()!!.toString().lowercase()

                for((index,element) in cars.withIndex()){
                    if(modiCar==element){
                        println("el auto $element con la posición $index será modificado, ingrese el nuevo nombre:  ")
                        val newName:String = readLine()!!.toString().lowercase()
                        cars[index]=newName
                        println("La lista ha sido modificada, y ahora quedaría así: "+cars)
                    }
                    else{
                        println("$modiCar no existe y por lo tanto, no será modificado. ingrese un nombre existente: ")
                        modiCar = readLine()!!.toString().lowercase()
                        println("$modiCar sí existe, ingrese el nuevo nombre: ")
                        val newName2= readLine()!!.toString().lowercase()
                        cars[index]=newName2
                        println("La lista ha sido modificada, y ahora quedaría así: "+cars)
                    }
                }
            }
            else if (menu==5){
                println("Ingrese el nombre del auto a eliminar: ")
                var deleteCar:String= readLine()!!.toString()

                for((index,element) in cars.withIndex()){
                    if (deleteCar==element){
                        cars.remove(deleteCar)
                        println("$deleteCar ha sido eliminado de la posición $index y la lista quedaria asi: "+cars)
                        break
                    }
                }

                println("$deleteCar no existe y por lo tanto, no será eliminado. ")
            }

        }
        else{
            println("Grascia por su tiempo")
            break
        }
    }

}