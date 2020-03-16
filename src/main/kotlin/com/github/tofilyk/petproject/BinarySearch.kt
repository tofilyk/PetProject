package com.github.tofilyk.petproject

fun binarySearch() {
    val listSorted = mutableListOf(1, 7, 0, 6, 9, 2, 4, 3, 8, 5)
    println("Initial numbers: [%s]".format(listSorted.joinToString()))
    for (pass in 0 until (listSorted.size - 1)) {
        for (currentPosition in 0 until (listSorted.size - pass - 1)) {
            if (listSorted[currentPosition] > listSorted[currentPosition + 1]) {

                val tmp = listSorted[currentPosition]
                listSorted[currentPosition] = listSorted[currentPosition + 1]
                listSorted[currentPosition + 1] = tmp
            }
        }
    }
    println("Sorted numbers: [%s] \n".format(listSorted.joinToString()))

    println("Please, enter the number you want to find \n")
//    var item = readLine()!!.toInt()
    var item = 0
    while (item < 11) {
        item++
        println("Test number = $item \n")

        var low = 0
        var high = listSorted.size - 1
        var stepCount = 0
        var isItemFound = false
        while (low <= high) {
            val mid = (low + high) / 2
            val guess = listSorted[mid]
            stepCount++
            println("Array is divided by 2. Middle position = $guess ")
            when {
                guess == item -> {
                    println("\n Your number $item was found in $stepCount steps \n")
                    isItemFound = true
                }
                guess > item -> high = mid - 1
                else -> low = mid + 1
            }
            if (isItemFound) break
        }
        if (!isItemFound) {
            println("Your number wasn't found")
        }
    }
}