/****
 * In Kotlin the way we create array is different as below
 */

fun main(){
    var demoArray = arrayOf(2,3,4,3,3,5,2,45,23);

    for(i in demoArray){
        print("${i} ")
    }

    var strArray = arrayOf<String>("erwer","erwre","cvbcvb","yukyuk");
    var numArray = arrayOf<Int>(3,3,3,5,3,56,4,6,34,3);
    print(strArray[0])

    /******
     _________________________
     */
    var mixArray = arrayOf(33,5,3,5,3,2,4,5,"sdfsdf","bvcbcv","qxqasa")
}