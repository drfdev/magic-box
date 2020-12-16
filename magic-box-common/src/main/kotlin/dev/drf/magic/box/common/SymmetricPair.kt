package dev.drf.magic.box.common

import java.util.*

/**
 * Kotlin Pair analogue
 * SymmetricPair(a, b) == SymmetricPair(b, a)
 */
data class SymmetricPair<out T>(
    val first: T,
    val second: T
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (javaClass != other?.javaClass) {
            return false
        }

        other as SymmetricPair<*>

        if (first == other.first && second == other.second) {
            return true
        }
        if (first == other.second && second == other.first) {
            return true
        }

        return false
    }

    /**
     * see java.util.AbstractSet hashCode()
     */
    override fun hashCode(): Int {
        return Objects.hashCode(first) + Objects.hashCode(second)
    }
}