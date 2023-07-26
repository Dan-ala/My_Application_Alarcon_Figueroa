package com.example.myapplication_alarcon_figueroa

import kotlin.math.PI

class Functions {
}

fun main() {
    /*print("ingrese su edad: ")
    val age:Int = readLine()!!.toInt()

    val validar =if (age>=18) "Bienvenido" else "Pa' la casa"
    println(validar)*/


    //Funcion area de un circulo y perimetro
    var choice = "yes"
    while (choice=="yes"){

        fun areaCirculo(){
            print("Ingrese el radio: ")
            var radio:Int = readLine()!!.toInt()
            var process = (radio*radio)
            var process2 = (PI*process)
            println("El area es: "+process2)
        }

        fun perCir(){
            print("Ingerse el radio: ")
            var radio:Int =readLine()!!.toInt()
            var process=(2*PI*radio)
            println("El perimetro es: "+process)
        }

        fun areaTriangulo(base:Int, altura:Int): Unit{
            var area=(base*altura)/2
            println("EL area del tri es: "+area)
        }

        fun perTri(l1:Int,l2:Int,l3:Int):Unit{
            var perTri:Int = l1+l2+l3
            println("el perimetro es: "+perTri)
        }

        fun areaRectan(l1:Int,l2:Int):Int{
            return l1*l2
        }

        fun perRectan(l1:Int,l2:Int):Int{
            return (l1*2)+(l2*2)
        }

        print("desea ver el menu?: ")
        choice = readLine()!!.toString()
        if (choice=="yes"){
            println("""
                Este es el menu:
                1. Función del área Circulo
                2. Función perímetro Circulo
                3. Función area triangulo
                4. Función perimetro triangulo
                5. Funcion del area del rectángulo - Con valo de retorno
                6. Funcion del perimetro del rectangulo - Con val de retorno
            """.trimIndent())



            print("Que desea realizar? Seleccione su opción: ")
            var menu:Int = readLine()!!.toInt()
            if (menu==1){
                println("Area del circulo")
                areaCirculo()
            }else if(menu==2){
                println("Perimetro del circulo")
                perCir()
            }
            else if(menu==3){
                println("Area del triangulo")
                println("ingerse su base:")
                var base = readLine()!!.toInt()
                println("ingrese su altura: ")
                var altura = readLine()!!.toInt()
                areaTriangulo(base,altura)
            }
            else if(menu==4){
                println("Ingrese lado1: ")
                var l1:Int = readLine()!!.toInt()
                println("Ingrese lado2: ")
                var l2:Int = readLine()!!.toInt()
                println("Ingrese lado3: ")
                var l3:Int = readLine()!!.toInt()
                perTri(l1,l2,l3)
            }
            else if(menu==5){
                println("ingrese el lado1: ")
                var l1:Int = readLine()!!.toInt()
                println("ingerse lado2: ")
                var l2 = readLine()!!.toInt()
                println(areaRectan(l1,l2))
            }
            else if(menu==6){
                println("ingrese el lado1: ")
                var l1:Int = readLine()!!.toInt()
                println("ingerse lado2: ")
                var l2 = readLine()!!.toInt()
                var r2=perRectan(l1, l2)
                println(r2)
            }

        }
        else{
            println("Gracias por su tiempo")
        }
    }
}