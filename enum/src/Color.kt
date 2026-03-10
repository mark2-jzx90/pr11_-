enum class Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    PURPLE,
    ORANGE,
    BLACK;

    fun getHexCode(): String {
        return when (this) {
            RED -> "#FF0000"
            GREEN -> "#00FF00"
            BLUE -> "#0000FF"
            YELLOW -> "#FFFF00"
            PURPLE -> "#800080"
            ORANGE -> "#FFA500"
            BLACK -> "#000000"
        }
    }

    fun getRGB(): Triple<Int, Int, Int> {
        return when (this) {
            RED -> Triple(255, 0, 0)
            GREEN -> Triple(0, 255, 0)
            BLUE -> Triple(0, 0, 255)
            YELLOW -> Triple(255, 255, 0)
            PURPLE -> Triple(128, 0, 128)
            ORANGE -> Triple(255, 165, 0)
            BLACK -> Triple(0, 0, 0)
        }
    }

    fun getRussianName(): String {
        return when (this) {
            RED -> "Красный"
            GREEN -> "Зеленый"
            BLUE -> "Синий"
            YELLOW -> "Желтый"
            PURPLE -> "Фиолетовый"
            ORANGE -> "Оранжевый"
            BLACK -> "Черный"
        }
    }

    fun getEnumOrder(): Int {
        return this.ordinal + 1
    }
}