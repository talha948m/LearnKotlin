package com.talha.learnkotlin
//Arrays
                               //AGENDA
                                       //. What is an Array
                                       //. Use of an Array
                                    //• If I want to store 50 favorite songs of a user
                                    //• Defining 50 variables will be a mess
                                    //• To solve these kinds of problems we have Arrays
                                    //.Object that stores multiple values of same type
                                    //.Fixed Size
fun main(){
    var arr = arrayOf("one","two","three")
    var arr1 = arrayOf(1,2,3)
    var arr2 = arrayOf<Int>(3,4,5)
    for ((i,e) in arr.withIndex()){
        println( "$i $e" )
    }
            // so i want to access the particular element of the array
    println(arr[0])
    println(arr[1])
            //if we can set the element value also
    arr.set(0,"hello")
    println(arr[0])
    println(arr.size)
            // the size of the array is 3 if we go beyond that what will happen
    println(arr[3])
}