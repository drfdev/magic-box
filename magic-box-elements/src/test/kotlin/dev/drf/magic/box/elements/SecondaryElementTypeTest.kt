package dev.drf.magic.box.elements

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SecondaryElementTypeTest {
    @Test
    fun shouldNotContainDuplicates() {
        val checker = mutableSetOf<Pair<ElementType, ElementType>>()

        for (value in SecondaryElementType.values()) {
            if (value.first == value.second) {
                assertTrue(checker.add(Pair(value.first, value.second)), "Duplicate: $value")
            } else {
                assertTrue(checker.add(Pair(value.first, value.second)), "Duplicate: $value")
                assertTrue(checker.add(Pair(value.second, value.first)), "Duplicate: $value")
            }
        }
    }

    @Test
    fun shouldNotContainIncompatibility() {
        for (value in SecondaryElementType.values()) {
            assertFalse(isCompatible(value.first, value.second), "Incompatibility: $value by ${value.first} and ${value.second}")
        }
    }
}