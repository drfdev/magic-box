package dev.drf.magic.box.elements

enum class SecondaryElementType(
        private val first: ElementType,
        private val second: ElementType) {

    DRAGON_FIRE(ElementType.FIRE, ElementType.FIRE)
    // TODO add other combination + test
}