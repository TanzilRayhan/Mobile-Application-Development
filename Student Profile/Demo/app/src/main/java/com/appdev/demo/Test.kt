package com.appdev.demo

fun main()
{
    val a=2
    val b=15
    val c=9
    if(a>b && a>c){
        println ("A is Largest")
    }
    else if (b>c && b>a){
        println ("B is Largest")
    }
    else {
        println ("C is Largest")
    }
}