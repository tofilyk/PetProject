package com.github.tofilyk.petproject

fun triangle() {

    println("Enter side A")
    val textA = readLine()?.toInt() ?: 1
    println("Enter side B")
    val textB = readLine()?.toInt() ?: 1
    println("Enter side C")
    val textC = readLine()?.toInt() ?: 1

    if (textA == 0 || textB == 0 || textC == 0)
        println("Side cannot be zero")
    else if (textA > textB + textC) println("Cannot be a triangle")
    else if (textB > textA + textC) println("Cannot be a triangle")
    else if (textC > textA + textB) println("Cannot be a triangle")
    else if (textA == textB && textA == textC && textB == textC)
        println("This is an equilateral triangle.")
    else if (textA == textB && textA != textC && textB != textC)
        println("This is an isosceles triangle.")
    else if (textA == textC && textA != textB && textC != textB)
        println("This is an isosceles triangle.")
    else if (textC == textB && textC != textA && textB != textA)
        println("This is an isosceles triangle.")
    else if (textA != textB && textB != textC && textA != textC)
        println("This is a scalene triangle.")

    return main()
}
