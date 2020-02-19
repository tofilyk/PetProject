package com.github.tofilyk.petproject

fun bubble(numbers: ArrayList<Int> = arrayListOf(1,4,0,6,9,2,4,3,8,1)) {
    println("Initial numbers: [%s]".format(numbers.joinToString(separator = ", ")))
    for (pass in 0 until (numbers.size - 1)) {
        // A single pass of bubble sort
        for (currentPosition in 0 until (numbers.size - pass - 1)) {

            if (numbers[currentPosition] > numbers[currentPosition + 1]) {

                val tmp = numbers[currentPosition]
                numbers[currentPosition] = numbers[currentPosition + 1]
                numbers[currentPosition + 1] = tmp
            }
        }
    }
    println("Sorted numbers: [%s]".format(numbers.joinToString(separator = ", ")))
    return main()
}
