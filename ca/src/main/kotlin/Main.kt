// import java.lang.Exception

fun main(args: Array<String>) {
    println("Hello World!")

    for (i in 1..5) {
        if (i == 1 || i == 5) {
            println("xxx\txxx\txxx")
            continue
        }
        if (i == 4) {
            println("x  \t  x\tx  ")
            continue
        }
        if (i == 2) {
            println("x  \tx  \tx  ")
        } else {
            println("x  \txxx\txxx")
        }
    }
}