package com.talha.learnkotlin

import kotlin.math.pow

// Agenda
                                        // .Function Overloading
                                        // .Named Argument
                                        // .Function Type
                // what is Function Overloading
                  //.Same name different parameters
                  //.Either number of parameters is different
                  //. Or Type is different
                        // Function Overloading
//fun main(){
//    println(addition(1,2))
//    println(addition(1.0,3.0))
//}
//        //These is Function Overloading same function name with different parameter
//fun addition(a: Int, b: Int) : Int
//{
//    return a + b
//}
//fun addition(a:Double,b:Double) : Double
//{
//    return a + b
//}
                    // Named Argument
        // where is so many numbers in argument so we assigned them by giving there value
//fun main(){
//    println(addition(a = 2, b = 5))
//    println(addition(a = 5.0, b = 3.0))
//}
//fun addition(a: Int, b: Int) : Int
//{
//    return a + b
//}
//fun addition(a:Double,b:Double) : Double
//{
//    return a + b
//}
                      // Function Type
                    // in kotlin we can store variables ke ander function
fun  main(){
   var fn = :: addition
   println(fn(1.0,2.0))
   fn = ::power
   println(fn(2.0,3.0))
}
fun addition(a:Double,b:Double) : Double
{
    return a + b
}
fun power(a:Double,b:Double) : Double
{
    return a.pow(b)
}
