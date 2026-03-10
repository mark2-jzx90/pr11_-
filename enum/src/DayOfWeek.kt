enum class DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    fun getDayNumber(): Int {
        return when (this) {
            MONDAY -> 1
            TUESDAY -> 2
            WEDNESDAY -> 3
            THURSDAY -> 4
            FRIDAY -> 5
            SATURDAY -> 6
            SUNDAY -> 7
        }
    }

    fun isWeekend(): Boolean {
        return this == SATURDAY || this == SUNDAY
    }

    fun getRussianName(): String {
        return when (this) {
            MONDAY -> "Понедельник"
            TUESDAY -> "Вторник"
            WEDNESDAY -> "Среда"
            THURSDAY -> "Четверг"
            FRIDAY -> "Пятница"
            SATURDAY -> "Суббота"
            SUNDAY -> "Воскресенье"
        }
    }

    fun getShortName(): String {
        return when (this) {
            MONDAY -> "ПН"
            TUESDAY -> "ВТ"
            WEDNESDAY -> "СР"
            THURSDAY -> "ЧТ"
            FRIDAY -> "ПТ"
            SATURDAY -> "СБ"
            SUNDAY -> "ВС"
        }
    }
}