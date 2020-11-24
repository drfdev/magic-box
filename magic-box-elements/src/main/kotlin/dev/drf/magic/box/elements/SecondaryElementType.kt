package dev.drf.magic.box.elements

enum class SecondaryElementType(
        private val first: ElementType,
        private val second: ElementType) {

    /* Fire block */
    DRAGON_FIRE(ElementType.FIRE, ElementType.FIRE),
    LIGHTNING(ElementType.FIRE, ElementType.ELECTRIC),
    FIRE_STORM(ElementType.FIRE, ElementType.WIND),
    MAGMA(ElementType.FIRE, ElementType.EARTH),
    DARK_FIRE(ElementType.FIRE, ElementType.DARK),
    HOLY_LIGHT(ElementType.FIRE, ElementType.HOLY),
    INNER_FIRE(ElementType.FIRE, ElementType.WILL),

    /* Water block */
    PURE_WATER(ElementType.WATER, ElementType.WATER),
    ICE(ElementType.WATER, ElementType.WIND),
    NATURE(ElementType.WATER, ElementType.EARTH),
    ELECTRIC_STREAM(ElementType.WATER, ElementType.ELECTRIC),
    DARK_WATER(ElementType.WATER, ElementType.DARK),
    HOLY_WATER(ElementType.WATER, ElementType.HOLY),
    VITALITY(ElementType.WATER, ElementType.WILL),

    /* Wind block */
    HURRICANE(ElementType.WIND, ElementType.WIND),
    SAND(ElementType.WIND, ElementType.EARTH),
    STORM(ElementType.WIND, ElementType.ELECTRIC),
    DARK_WIND(ElementType.WIND, ElementType.DARK),
    BREEZE(ElementType.WIND, ElementType.HOLY),
    STRONG_WIND(ElementType.WIND, ElementType.WILL),

    /* Earth block */
    ROCK(ElementType.EARTH, ElementType.EARTH),

    /* Electric block */
    SHOCK(ElementType.ELECTRIC, ElementType.ELECTRIC),

    /* Dark block */
    DARKNESS(ElementType.DARK, ElementType.DARK),

    /* Holy block */
    SHINE(ElementType.HOLY, ElementType.HOLY),

    /* Will block */
    STRONG_WILL(ElementType.WILL, ElementType.WILL)

    // TODO add other combination + test
}