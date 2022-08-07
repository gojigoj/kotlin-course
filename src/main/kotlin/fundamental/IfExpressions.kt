fun main() {
    val openHours = 7
    val now = 20
    val office1 = ifExpression1(openHours, now)
    val office2 = ifExpression2(openHours, now)
    val office3 = ifExpression3(openHours, now)
}

fun ifExpression1(openHours: Int, now: Int): String {
    if (now > openHours) {
        return "Office already open"
    }
    return ""
}

fun ifExpression2(openHours: Int, now: Int): String {
    var office: String

    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is already closed"
    }

    //or

    office = if (now > openHours) {
        "Office already open"
    } else {
        "Office is closed"
    }

    return office
}

fun ifExpression3(openHours: Int, now: Int): String  {
    val office: String = if (now > openHours) {
        "Office already open"
    } else if (now == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    return office
}