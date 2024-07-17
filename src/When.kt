/****
 * IF we have multiple if else condition in that condition we should use when
 *
 * if(condition1){
 * }else if(condition 2){
 * }else if(condition 3){
 * }else if(condition 4){
 * }.
 * .
 * .
 * .
 * .
 *
 * .else if(condition n){
 * }
 *
 so in this case we should use when statement
 * **/
fun main(){

val number = 3
when(number) {
    0 -> println("Number is 0")
    1 -> println("Number is 1")
    2 -> println("Number is 2")
    3 -> println("Number is 3")
    4 -> println("Number is 4")
    else -> println("Number is not present")
}
}

/*****
 * In java for same case we use switch case to address this issue
 */