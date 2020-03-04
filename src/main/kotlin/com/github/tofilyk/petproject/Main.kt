package com.github.tofilyk.petproject

fun main() {

    println(
        "\n" +
                "      ======MENU======" + "\n" +
                " Enter 1 for Play Guess the number \n Enter 2 for Mortgage calculator \n Enter 3 for Salary calculator \n" +
                " Enter 4 for Bubble sort \n Enter 5 for Triangle \n Enter 911 for return to menu"
    )
    val xas = readLine()?.toInt()

    if (xas == 1) ran()
    if (xas == 2) allres
    if (xas == 3) salary()
    if (xas == 4) bubble()
    if (xas == 5) triangle()

    if (xas == 911) main()

}