package com.example.myapplication_alarcon_figueroa

class Conditionals {
}


fun main() {
    /* print("Enter the first number: ")
     var number1:Int= readLine()!!.toInt()
     print("Enter the second number: ")
     var number2:Int = readLine()!!.toInt()

     if (number1>number2){
         //True
         print("$number1 is greater than $number2")

     }else if(number1==number2){
         print("They are alike")

     }else{
         //False
         print("$number2 is greater than $number1")
     }*/

    /*print("Enter a number from 1 to 20: ")
    var numberUsu:Int =readLine()!!.toInt()
    if (numberUsu in 1..20){
        print("Perfect number withing the range!")
    }else{
        print("I told you to enter a number within the previous range, try again")
    }*/

    var results:Int = (1..50).random()
    print("The number is $results \n")

    when(results){
        0 -> println("No results")
        1,2,3,4,5-> println("There are less than 5 results")
        in 6..50-> println("There are between 5 and 50 results")
        else -> println("There are too many results")
    }
}