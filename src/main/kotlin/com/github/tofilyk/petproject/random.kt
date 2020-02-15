package com.github.tofilyk.petproject


fun ran(){

    println("Now you need to guess a random number. \n Choose the number of attempts from 1 to 10")
    var answer_attempts = readLine()!!.toInt()
    val win_limit = answer_attempts * 2
    when (answer_attempts) {
        in (1..10) -> println("Choose a number between $win_limit-100")
        !in (1..10) -> {
            println("Invalid number")
            return
        }
    }
    val answer = readLine()!!.toInt()
    when (answer) {
        in (win_limit..100) -> println("Now enter the number.I will help with tips. \n Enter the number.")
        !in (win_limit..100) -> {
            println("Invalid number")
            return
        }
    }
    val result = answer_attempts.toDouble() / answer.toDouble() * 100
    println(" $result Chance to win")
    val random_number = (1..answer).random()
    for (it in 1..answer_attempts) {
        val answer_final = readLine()!!.toInt()
        if ("$answer_final" == "$random_number") {
            println("True")
            return
        }
        if ("$answer_final" > "$random_number") println("Select a lower number")
        if ("$answer_final" < "$random_number") println("Select a larger number")
        val attempts_left = (answer_attempts-- - 1)
        println("Attempts_left $attempts_left")
    }
}



