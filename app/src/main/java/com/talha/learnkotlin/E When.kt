package com.talha.learnkotlin

//fun main(){
                                             //    EG 1          RANGE
//    val number = 10
//    val result =number in 1..10
//    print(result)
    // OUTPUT: TRUE
    //              EG 2
//    val number = 10
//    val result =number in 1 until 10
//    print(result)
                                            // OUTPUT: FALSE because 10 is not in range

   //val animal = "dog"

//    if (animal == "horse"){
//        println("Animal is horse")
//    }
//    else if ( animal == "cat"){
//        println("animal is cat")
//    }
//    else if ( animal == "dog"){
//        println("Animal is dog")
//    }
//    else {
//        println("Animal is not found")
//    }
                                            // When statement
//    val result = when(animal){
//        "horse" ->("Animal is horse")
//        "cat" ->  ("animal is cat")
//        "dog" -> ("Animal is dog")
                                            //in default value we use else
//        else -> ("Animal is not found")
//    }
//    println(result)
//}
fun  main(){
    val number = 14
    val result = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19-> "Teen"
        else -> "not in range"
    }
    println(result)
}
