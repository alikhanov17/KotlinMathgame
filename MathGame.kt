class MathGame {

    var res: Int = 0

    fun Result(a: Int, b: Int, c: Int) {
        when (c) {
            0 -> {
                res = a + b
                println("$a + $b=")
            }
            1 -> {
                res = a - b
                println("$a - $b=")
            }
            2 -> {
                res = a * b
                println("$a * $b=")
            }
            3 -> {
                res = a / b
                println("$a / $b=")
            }
        }
    }
}