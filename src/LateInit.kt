/***
 * This Late init reffers to use of a variable that we will initialze an varable value later in
 * Program as below
 * here we are lateiniting the value of message and updating in demo method of class LateInitDemo
 */

fun main(){
 val demo = LateInitDemo();

//    demo.printVar();
    demo.demo()
}
class LateInitDemo {
     lateinit var message: String

     fun printVar (){
         println("Value of messge ${message}")
     }
     fun demo(){
         message = "Used LateInit to Updated Value later in Class";

         println("Value of Message ${message}")

     }}