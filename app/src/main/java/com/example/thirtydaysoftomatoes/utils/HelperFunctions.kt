package com.example.thirtydaysoftomatoes.utils


fun generateFlippedNumbers(totalNumbers: Int): List<Int> {
    val list: MutableList<Int> = mutableListOf()
    for (i in 1..totalNumbers step 4) {
        if (i % 2 != 0) {
            list.add(i)
            list.add(i + 1)
        }
    }
    return list
}

fun shouldBeFlipped(number: Int, totalNumbers: Int): Boolean {
    return generateFlippedNumbers(totalNumbers).contains(number)
}