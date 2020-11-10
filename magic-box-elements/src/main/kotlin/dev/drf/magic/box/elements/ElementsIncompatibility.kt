package dev.drf.magic.box.elements

val INCOMPATIBILITY_MAP = mapOf(
        ElementType.FIRE to ElementType.WATER,
        ElementType.WATER to ElementType.FIRE,
        ElementType.ELECTRIC to ElementType.EARTH,
        ElementType.EARTH to ElementType.ELECTRIC,
        ElementType.DARK to ElementType.HOLY,
        ElementType.HOLY to ElementType.DARK,
);

fun isCompatible(left: ElementType, right: ElementType): Boolean {
    return INCOMPATIBILITY_MAP[left] == right
}