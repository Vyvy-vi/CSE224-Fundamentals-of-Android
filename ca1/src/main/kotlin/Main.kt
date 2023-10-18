fun main(args: Array<String>) {
    val cities = arrayOf("Hyderabad", "Chennai", "Mumbai", "Kolkata", "Bengaluru");
    var str: String = "abcdefghijklmnopqrstuvwxyz"

    for (city in cities) {
        var freq = arrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)

        val get_letter = {x: Int -> str[x]}
        val get_index = {ch: Char -> str.indexOf(ch.toLowerCase())}

        for (word in city) {
            freq[get_index(word)]++
        }

        var index = 0
        print("${city}- ")
        while (index < freq.size) {
            print("${get_letter(index)} : ${freq[index]}, ")
            index++
        }
        println()
    }
}