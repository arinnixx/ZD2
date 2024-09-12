fun main() {

    println("Введите строку символов: ")
    val text= readln()
    var chars=text.toList().distinct().sorted()
    var result=""
    for (char in chars)
    {
        result+="$char-${text.count{c->c==char}}\n"
    }
    println("Результат:\n$result")
}