fun main() {
    val names: Map<Int,String> = mapOf(
        1 to "Генрих",
        2 to "Генадий",
        3 to "Виктор",
        4 to "Peter",
        5 to "Cody",
        6 to "Tom",
        7 to "Гендальф",
        8 to "Helen",
        9 to "Peter",
        10 to "Cody",
        11 to "Sara",
        12 to "Klara"
    )

    names.filter { it.value[0] == 'Г' }.forEach{
        println(it)
    }
}