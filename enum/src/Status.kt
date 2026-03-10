enum class Status {
    PENDING,
    CONFIRMED,
    PREPARING,
    COOKING,
    READY_FOR_DELIVERY,
    OUT_FOR_DELIVERY,
    DELIVERED,
    CANCELLED;

    fun getRussianStatus(): String {
        return when (this) {
            PENDING -> "Ожидает подтверждения"
            CONFIRMED -> "Подтвержден"
            PREPARING -> "Готовится"
            COOKING -> "Готовится"
            READY_FOR_DELIVERY -> "Готов к доставке"
            OUT_FOR_DELIVERY -> "В пути"
            DELIVERED -> "Доставлен"
            CANCELLED -> "Отменен"
        }
    }

    fun getCompletionPercentage(): Int {
        return when (this) {
            PENDING -> 10
            CONFIRMED -> 25
            PREPARING -> 40
            COOKING -> 60
            READY_FOR_DELIVERY -> 75
            OUT_FOR_DELIVERY -> 90
            DELIVERED -> 100
            CANCELLED -> 0
        }
    }

    fun canBeCancelled(): Boolean {
        return when (this) {
            PENDING, CONFIRMED -> true
            else -> false
        }
    }

    fun getNextStatus(): Status? {
        return when (this) {
            PENDING -> CONFIRMED
            CONFIRMED -> PREPARING
            PREPARING -> COOKING
            COOKING -> READY_FOR_DELIVERY
            READY_FOR_DELIVERY -> OUT_FOR_DELIVERY
            OUT_FOR_DELIVERY -> DELIVERED
            DELIVERED, CANCELLED -> null
        }
    }
}