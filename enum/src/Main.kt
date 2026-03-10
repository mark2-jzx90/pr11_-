fun main() {
    println("День недели")
    println("")
    testDaysOfWeek()

    println("\nЦвета")
    println("")
    testColors()

    println("\nприготовления блюд в пиццерии")
    println("")
    testOrderStatus()
}

fun testDaysOfWeek() {
    DayOfWeek.values().forEach { day ->
        println("День: ${day.name}")
        println("  Числовое значение: ${day.getDayNumber()}")
        println("  Русское название: ${day.getRussianName()}")
        println("  Сокращение: ${day.getShortName()}")
        println("  Выходной? ${if (day.isWeekend()) "Да" else "Нет"}")
        println("---")
    }
}

fun testColors() {
    Color.values().forEach { color ->
        println("Цвет: ${color.name}")
        println("  Порядковый номер: ${color.getEnumOrder()}")
        println("  Русское название: ${color.getRussianName()}")
        println("  HEX код: ${color.getHexCode()}")
        val (r, g, b) = color.getRGB()
        println("  RGB: ($r, $g, $b)")
        println("")
    }
}

fun testOrderStatus() {
    Status.values().forEach { status ->
        println("Статус: ${status.name}")
        println("  Русский: ${status.getRussianStatus()}")
        println("  Процент выполнения: ${status.getCompletionPercentage()}%")
        println("  Можно отменить: ${if (status.canBeCancelled()) "Да" else "Нет"}")
        println("  Следующий статус: ${status.getNextStatus()?.name ?: "Конечный статус"}")
        println("")
    }
}