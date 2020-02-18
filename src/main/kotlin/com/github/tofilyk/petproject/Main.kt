package com.github.tofilyk.petproject


fun main(){
    println(" Enter 1 for game random \n Enter 2 for Calc \n Enter 3 for Salary \n Enter 911 for return to menu")
    val xas = readLine()?.toInt() ?: 5

    if (xas == 1) ran()
    if (xas == 2)  allResult
    if (xas == 3)  salary()

}


