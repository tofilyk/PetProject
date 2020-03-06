package com.github.tofilyk.petproject

import java.util.Scanner

fun coffe() {
    val scanner = Scanner(System.`in`)
    val water = 1200
    val milk = 540
    val coffe = 120
    val cups = 9
    val money = 550

    fun result() {
        println(
            "The coffee machine has:\n" +
                    "$water of water\n" +
                    "$milk of milk\n" +
                    "$coffe of coffee beans\n" +
                    "$cups of disposable cups\n" +
                    "$money of money\n \n" +
                    "Write action (buy, fill, take):"
        )
    }

    fun cappuccino() {
        println(
            "The coffee machine has:\n" +
                    "${water - 200} of water\n" +
                    "${milk - 100} of milk\n" +
                    "${coffe - 12} of coffee beans\n" +
                    "${cups - 1} of disposable cups\n" +
                    "${money + 6} of money\n \n"
        )
    }

    fun espresso() {
        println(
            "The coffee machine has:\n" +
                    "${water - 250} of water\n" +
                    "${milk - 0} of milk\n" +
                    "${coffe - 16} of coffee beans\n" +
                    "${cups - 1} of disposable cups\n" +
                    "${money + 4} of money\n \n"
        )
    }

    fun latte() {
        println(
            "The coffee machine has:\n" +
                    "${water - 350} of water\n" +
                    "${milk - 75} of milk\n" +
                    "${coffe - 20} of coffee beans\n" +
                    "${cups - 1} of disposable cups\n" +
                    "${money + 7} of money\n \n"
        )
    }

    result()
    val userInput = scanner.next()
    if (userInput == "buy") {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
        val userInput2 = scanner.nextInt()
        if (userInput2 == 1) espresso()
        if (userInput2 == 2) latte()
        if (userInput2 == 3) cappuccino()
    }

    if (userInput == "fill") {
        println("Write how many ml of water do you want to add:")
        val userFill1 = scanner.nextInt()
        println("Write how many ml of milk do you want to add:")
        val userFill2 = scanner.nextInt()
        println("Write how many grams of coffee beans do you want to add:")
        val userFill3 = scanner.nextInt()
        println("Write how many disposable cups of coffee do you want to add:")
        val userFill4 = scanner.nextInt()
        fun fill() {
            println(
                "The coffee machine has:\n" +
                        "${water + userFill1} of water\n" +
                        "${milk + userFill2} of milk\n" +
                        "${coffe + userFill3} of coffee beans\n" +
                        "${cups + userFill4} of disposable cups\n" +
                        "$money of money\n \n"
            )
        }
        fill()
    }
    if (userInput == "take") {
        println("I gave you $$money \n")
        fun take() {
            println(
                "The coffee machine has:\n" +
                        "$water of water\n" +
                        "$milk of milk\n" +
                        "$coffe of coffee beans\n" +
                        "$cups of disposable cups\n" +
                        "0 of money\n \n"
            )
        }
        take()
    }
}
