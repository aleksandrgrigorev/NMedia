package ru.netology.nmedia.adapter

fun formatNumber(count: Int): String {
    return when {
        count < 1000 -> count.toString()
        count in 1000..9999 -> format(count, 1000.0, "K")
        count in 10000..999999 -> formatInt(count, "K")
        else -> format(count, 1_000_000.0, "M")
    }
}

private fun format(count: Int, divisor: Double, units: String): String {
    val number = (count / divisor * 10.0).toInt() / 10.0
    return "%.1f%s".format(number, units)
}

private fun formatInt(count: Int, units: String): String {
    val number = (count / 1000)
    return "%d%s".format(number, units)
}