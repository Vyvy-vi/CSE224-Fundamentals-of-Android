package com.example.kotlindemobasics

/* */
fun main(args:Array<String>)
{
    //A. traditional recursion:
    println("the factorial is "+fact(5))
    println("hello world");   // putting semi colon at the end is optional
}
/* this is not correct as recusion must return the value
fun fact(a:Int)
{  a = a*fact(a-1) //argument of function is val type so cant be changed
    println("the factorial is $b")
} */
fun fact(a:Int):Int
{
    //return a*fact(a-1)
    return 0
}


//B. Tail Recursion

