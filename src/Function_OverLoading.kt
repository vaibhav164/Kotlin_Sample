/********
 * In function overloading the function name is same but the number of parameter of type or parameter or return type is
 * different
 */

fun main(){
    println("${sum(5,6)} overloading example")
    println("${sum(5,6.7)} for parameter type")
    println("${sum(4,6.6,8)} for number of parameter")
    println("${sum(4.5,5.6)} for return type")
}

fun sum(a:Int, b:Int) = a+b
fun sum(a:Int, b:Double, c:Int)= a+b+c
fun sum(a:Int, z:Double)= a+z
fun sum(a:Double, b:Double):Double= a+b