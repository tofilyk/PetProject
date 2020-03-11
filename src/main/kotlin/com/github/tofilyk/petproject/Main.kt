package com.github.tofilyk.petproject

fun main() {

    println(
        "\n" +
                "      ======MENU======" + "\n" +
                " Enter 1 for Play Guess the number \n Enter 2 for Mortgage calculator \n Enter 3 for Salary calculator \n" +
                " Enter 4 for Bubble sort \n Enter 5 for Triangle \n Enter 6  for Coffe machine \n Enter 911 for return to menu"
    )
    val menuItem = readLine()?.toInt()

    if (menuItem == 1) ran()
    if (menuItem == 2) allres
    if (menuItem == 3) salary()
    if (menuItem == 4) bubble()
    if (menuItem == 5) triangle()
    if (menuItem == 6) coffe()
    if (menuItem == 911) main()
}
