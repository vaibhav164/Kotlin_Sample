/*****
 * using set method of array we can set the value of specific index as per out requirement
 * e.g., below
 */

fun main(){
    var num = arrayOf(23,23,5,43,34,4,2,1,4,5,3);
    num.set(0,1111111);//this will set the value of num array 0th index from 23 to 1111111
    println(num[0])
//    L8 is same as below line
    num[0]=7777777; 
    println(num[0])

    //L8 and l11 will work same
}
