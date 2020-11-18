package dev.drf.magic.box.elements

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ElementsIncompatibilityTest {
    @Test
    fun shouldCorrectIncompatibilitySize() {
        val size = INCOMPATIBILITY_MAP.size

        assertTrue(size % 2 == 0)
    }

    @Test
    fun shouldDuplicateIncompatibilityKeyValue() {
        for (key in INCOMPATIBILITY_MAP.keys) {
            val value = INCOMPATIBILITY_MAP[key]
            val keyValue = INCOMPATIBILITY_MAP[value]

            assertEquals(key, keyValue)
        }
    }
}