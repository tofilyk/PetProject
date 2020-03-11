package com.github.tofilyk.petproject
import java.util.Scanner

fun coffe() {
    val scanner = Scanner(System.`in`)
    var water = 400
    var milk = 540
    var coffe = 120
    var cups = 9
    var money = 550
    repeat(9000000) {
        fun printMenu() = println("Write action (buy, fill, take, remaining, exit):")
        printMenu()
        fun result() = println(
            "The coffee machine has:\n" +
                    "$water of water\n" +
                    "$milk of milk\n" +
                    "$coffe of coffee beans\n" +
                    "$cups of disposable cups\n" +
                    "$money of money\n \n"
        )

        val userInput = scanner.next()
        if (userInput == "buy") {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
            if (water > 350 && milk > 100 && coffe > 20 && cups > 1)
                println("I have enough resources, making you a coffee!")
            if (water < 350 || milk < 100 || coffe < 20 || cups < 1) {
                println("Sorry, not enough water!")
                return@repeat
            }
            val userInput2 = scanner.next()
            if (userInput2 == "back")
                return@repeat

            if (userInput2 == "1") {
                water -= 250
                coffe -= 16
                cups -= 1
                money += 4
            }
            if (userInput2 == "2") {
                water -= 350
                milk -= 75
                coffe -= 20
                cups -= 1
                money += 7
            }
            if (userInput2 == "3") {
                water -= 200
                milk -= 100
                coffe -= 12
                cups -= 1
                money += 6
            }
        }
        if (userInput == "fill") {
            println("Write how many ml of water do you want to add:")

            val userFill1 = scanner.nextInt()
            water += if (userFill1 < 0 || userFill1 > 10000) 0
            else userFill1
            if (userFill1 > 10000) {
                println("Max 10000 ml")
                return@repeat
            } else if (userFill1 < 0) {
                println("Value must be greater than 0")
                return@repeat
            } else println("Write how many ml of milk do you want to add:")
            val userFill2 = scanner.nextInt()
            milk += if (userFill2 < 0 || userFill2 > 10000) 0
            else userFill2
            if (userFill2 > 10000) {
                println("Max 10000 ml")
                return@repeat
            } else if (userFill2 < 0) {
                println("Value must be greater than 0")
                return@repeat
            } else println("Write how many grams of coffee beans do you want to add:")
            val userFill3 = scanner.nextInt()
            coffe += if (userFill3 < 0 || userFill3 > 2000) 0
            else userFill3
            if (userFill3 > 2000) {
                println("Max 2000 gr")
                return@repeat
            } else if (userFill3 < 0) {
                println("Value must be greater than 0")
                return@repeat
            } else println("Write how many disposable cups of coffee do you want to add:")
            val userFill4 = scanner.nextInt()
            cups += if (userFill4 < 0 || userFill4 > 1000) 0
            else userFill4
            if (userFill4 > 1000) {
                println("Max 1000 cups")
                return@repeat
            } else if (userFill4 < 0) {
                println("Value must be greater than 0")
                return@repeat
            }
        }
        if (userInput == "take") {
            println("I have $money dollars. How much do you want to take?")
            val takeMoney = scanner.nextInt()
            money -= if (takeMoney < 0 || takeMoney > money) 0
            else takeMoney
            if (takeMoney < 0)
                println("I gave you 0$ \n")
            else if (takeMoney > money)
                println("I can only give $money dollars \n")
            else println("I gave you $takeMoney$ \n")
        }
        if (userInput == "remaining") result()
        if (userInput == "exit") return
    }
}
