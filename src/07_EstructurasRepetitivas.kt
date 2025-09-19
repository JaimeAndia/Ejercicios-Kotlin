import kotlin.coroutines.coroutineContext

fun main(){
    //Bucle while
    var i = 10
    while (i != 0){
        println("Voy a suspender $i")
        i--;
    }
    println()

    //Bucle for
    for (num in 1 .. 10){
        println("Voy a aprobar $num")
    }
    println()
    for (num in 10 downTo 0 step 2) {
        println("Voy a aprobar otra vez $num")
    }
    println()
    var letra : Char = 'a'
    for (char in 'a'..'f'){
        println(char)
    }
    println()
    for (char in 'f' downTo 'a'){
        println(char)
    }
    println()
    for (char in 'a' until 'f'){
        println(char)
    }

    //Recorrer un string
    println()
    for (c in "Michael"){
        println(c)
    }

    buclePrincipal@ for (num in i .. 10){
        for (num2 in 1..5){
            if (num == num2){
                break@buclePrincipal
            }
        }
    }

}