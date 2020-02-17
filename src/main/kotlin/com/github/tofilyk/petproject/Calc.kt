package com.github.tofilyk.petproject


    open class man {
        open val salary: Double = 40000.0
        val month: Double = (salary / 100) * 5
        val year = month * 12
        val yearTen: Int = (month * 12 * 10).toInt()
        fun standartSum() = println("Standard  calculation $yearTen rub")
        val positive: Sequence<Double> = generateSequence(salary) { it + (it / 100 * 15) }
        val posSum = (positive.take(10).sum() * 12 * 0.05).toInt()
        fun possitiveSum() = println("Positive  calculation $posSum rub")
        val bankPercent = generateSequence(year) { it + ((it / 100) * 7) }.take(10).toList().sum().toInt()
        fun bankStandart() = println("Standard  calculation bank procent ${bankPercent} rub")
        val bankPercentPositive = generateSequence(salary) { (it + ((it / 100) * 15) + ((it / 100) * 7)) }.take(10)
        val bankPositivesum = (bankPercentPositive.sum() * 12 * 0.05).toInt()
        fun bankPositive() = println("Positive  calculation bank procent $bankPositivesum rub")
    }

    open class woman : man() {
        override val salary: Double
            get() = 35000.0

        fun sumPositive() = println("Positive for two ${posSum + man().posSum} rub")
        fun sumStandartAll() = println("Standard for two ${yearTen + man().yearTen} rub")
        fun sumStandartbank() = println("Standard for two + bank procent ${bankPercent + man().bankPercent} rub")
        fun sumPositiveBank() = println("Positive for two + bank procent ${bankPositivesum + man().bankPositivesum} rub")
 fun returnHome(){
     return main()
 }
    }
    val allResult = object :woman(){

        init {
            println("For man:")
            man().standartSum() // Выводим накопления мужа за 10 лет. Зарплата не меняется.
            man().bankStandart() //  Выводим накопления мужа за 10 лет. Зарплата не меняется. Но с складываем в банк под 7%.
            man().possitiveSum() //  Выводим накопления мужа за 10 лет. Зарплата ежегодно повышается на 15%.
            man().bankPositive() // Выводим накопления мужа за 10 лет. Зарплата ежегодно повышается на 15% + процент банка.
            println("For woman:")
            standartSum() // Выводим накопления жены за 10 лет. Зарплата не меняется.
            bankStandart() // Выводим накопления жены за 10 лет. Зарплата не меняется. Но с складываем в банкпод 7%.
            possitiveSum() // Выводим накопления жены за 10 лет. Зарплата ежегодно повышается на 15%.
            bankPositive() // Выводим накопления жены за 10 лет. Зарплата ежегодно повышается на 15% + процент банка.
            println("For man and woman:")
            sumStandartAll() // Выводим накопления пары за 10 лет. Зарплата не меняется.
            sumStandartbank() //  Выводим накопления пары за 10 лет. Зарплата не меняется. Оба все складывали в банк.
            sumPositive() // Выводим накопления пары за 10 лет. Зарплата ежегодно повышается на 15% у обоих.
            sumPositiveBank() // Выводим накопления пары за 10 лет. Зарплата ежегодно повышается на 15% у обоих + банк процент
            returnHome()

        }


    }

