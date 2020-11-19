package dev.drf.magic.box.elements

enum class SecondaryElementType(
        private val first: ElementType,
        private val second: ElementType) {

    /* Fire block */
    DRAGON_FIRE(ElementType.FIRE, ElementType.FIRE),

    /* Water block */
    PURE_WATER(ElementType.WATER, ElementType.WATER),

    /* Wind block */
    HURRICANE(ElementType.WIND, ElementType.WIND)

    /* Earth block */

    /* Electric block */

    /* Dark block */

    /* Holy block */

    /* Will block */

    // TODO add other combination + test
}