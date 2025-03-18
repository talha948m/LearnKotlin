package com.talha.learnkotlin
                                            //eg 1 while loop
//fun main(){
//    var count = 5
//    while(count >= 1){
//        println("Hello talha")
//                            // count -- used for stopping the loop otherwise it will become infinite loop
//        count--
//    }
//}
                                            //eg2 while loop
//fun main(){
//    var number = 2
//    var index = 1
//    while (index<=10)
//    {
//        println(number * index)
//        index++
//    }
//                                        //for adding two string we use +
//    println("outside loop - " + index)
//}

                                            // do while loop
//fun main(){
//    var index = 6
//      do{
//        println("hello")
//        index++
//      }while (index>5)
//}

                //you know how many time you will run loops you use FOR LOOP
                                    //otherwise
                // if you dont know how many times the iteration will work you should choose WHILE LOOP
                                             //For loops eg 1
//fun main(){
                        //these for loops for increment 1,2,3,4,5
//    for (i in 1..5){
//        println(i)
//    }
                //if i want my loop give me more increment so we add step
//     for (i in 1..10 step 5){
//         println(i)
//     }
//      for (i in 1 until 5){
//                // the until word that does not support upper bond that is last number
//          println(i)
//      }
               //these for loops for decrement 5,4,3,2,1
//      for (i in 10 downTo  1 step 2){
//        println(i)
//      }
//}
                //program 2 table
fun main(){
    val number = 2
    for (i in 1..10)
    {
                // when ever we want to convert our number data type to string we use .toString()
        //println( number.toString() + " x " + i + " = " + (number * i))
        // String templating
        println("$number x $i = ${number * i}")
    }
}

