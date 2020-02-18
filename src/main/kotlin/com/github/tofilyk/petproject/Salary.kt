package com.github.tofilyk.petproject

fun salary() {
    println("What is your salary?")
    val userInputSalary = readLine()?.toInt() ?: 0
    if (userInputSalary == 911) return main()

    println("How much do you spend on food?")
    var x = readLine()?.toInt() ?: 0
    if (x == 911) return main()
    val salaryList = mutableListOf(0)
    fun cath() = x.let { salaryList.add(it) }
    fun minus() = salaryList.fold(userInputSalary) { a, b -> a.minus(b) }
    fun percent() = x / (userInputSalary / 100)
    cath()
    println(
        "Balance ${minus()} \n" +
                "You spend ${percent()}% of your salary \n How much do you spend on mobile? "
    )
    x = readLine()?.toInt() ?: 0
    if (x == 911) return main()
    cath()
    println(
        "Balance ${minus()} \n" +
                " You spend ${percent()}% of your salary \n How much do you spend on rent?"
    )
    x = readLine()?.toInt() ?: 0
    if (x == 911) return main()
    cath()
    println(
        "Balance ${minus()} \n " +
                "You spend ${percent()}% of your salary \n How much do you spend on transport?"
    )
    x = readLine()?.toInt() ?: 0
    if (x == 911) return main()
    cath()
    println(
        "Balance ${minus()} \n " +
                "You spend ${percent()}% of your salary"
    )
    return main()
}