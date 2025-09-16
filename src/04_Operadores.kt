fun main(){

    var a = 7
    var b = 5

    println("($a + $b) = ${a + b}") //Con el $ se recupera el valor de la variable
    println("(a + b) = ${a + b}")
    println("($a - $b) = ${a - b}")
    println("($a / $b) = ${a / b}")
    println("($a * $b) = ${a * b}")
    println("($a % $b) = ${a % b}")

    val input = 5
    var result: Boolean

    val greaterThanZero = input > 0
    val isEven = input % 2 == 0

    result = greaterThanZero && isEven
    println("Es mayor que cero y par:$result")

    result = greaterThanZero || isEven
    println("Es mayor que cero o par:$result")

    result = greaterThanZero && !isEven
    println("Es mayor que cero e impar:$result")

    a = 10
    b = 20

    a += b
    println("+= $a")
    a -= b
    println("-= $a")
    a *= b
    println("*= $a")
    a /= b
    println("/= $a")
    a %= b
    println("%= $a")
}