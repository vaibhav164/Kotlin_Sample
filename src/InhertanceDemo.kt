fun main(){
    val USER = Singer("Ansu", 67)
    USER.userInfo();
}

open class Human(name:String, age:Int) {
    var name = name
    var age = age
    fun userInfo(){
        println("${name} is ${age} years old")
    }
}

class Singer (name:String, age:Int):Human(name, age){
    var singerName = name
    var singerAge = age
    fun sings(){
        println("${singerName} sings is ${singerAge} years old")
    }
}

class MathTeacher(name:String, age:Int):Human(name,age){
    var teacherName = name
    var teacherAge = name

    fun techesmaths(){
        println("${teacherName} teaches maths and is ${teacherAge} years old")
    }
}

//Note the point that here if the instance of is created for derived class then from that instance we will be
//able to access the parent class values or function
/**********
 * But if the instance is created for parent class then it will not be able to access the feature of derived class
 *
 *
 * */
