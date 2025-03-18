package com.talha.learnkotlin

fun main(){
    // all are arguments
    val result = add(4,5)
    println(result)
    val result2 = add(6,7)
    println(result2)
    evenOrOdd(14)
    evenOrOdd(29)
    printMessage(5)
    printMessage()
}
                // in return we have to mention the data type in there like these
                // fun add(num1: Int, num2: Int ): Int
                // all are parameter
//fun add(num1: Int, num2: Int ): Int
//{
//    val  sum = num1 + num2
//    return sum
//}
                // inline function
fun add(num1: Int, num2: Int ) = num1 + num2
                            //Eg 2
fun evenOrOdd(num1: Int): Unit{
                // it does not have return type in kotlin its called UNIT type
                // if you mention UNIT it does not change anything the output will be same
                // if you see the code of UNIT it seen dull kotlin suggest that it doesn't required
    val result = if(num1 %2 == 0) "Even" else "Odd"
    println(result)
}
                    //Default Argument
        // if a man is not giving input i want it print 2 time so i will use default arguments
        // if man give input it will choose that other wise it will choose default
fun printMessage(count: Int = 2){   // all are parameter
    // all these variables are val so it cant be reassigned
    for (i in 1..count){
        println("Hello $i")
    }
}