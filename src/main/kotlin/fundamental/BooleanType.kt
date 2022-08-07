fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    println(conjuctionExpression(officeOpen, officeClosed, now))
    println(disjunctionExpression(officeOpen, officeClosed, now))
    println(negationExpression(officeOpen, officeClosed, now))
}

fun conjuctionExpression(officeOpen: Int, officeIsClosed: Int, now: Int): String {
    val isOpen = now >= officeOpen && now <= officeIsClosed

    return "Office is open: $isOpen"
}

fun disjunctionExpression(officeOpen: Int, officeIsClosed: Int, now: Int): String {
    val isCLose = now < officeOpen || now > officeIsClosed

    return "Office is open: $isCLose"
}

fun negationExpression(officeOpen: Int, officeIsClosed: Int, now: Int): String {
    val isOpen = now > officeOpen

    return if (!isOpen) {
        "Office is closed"
    } else {
        "Office is open"
    }
}