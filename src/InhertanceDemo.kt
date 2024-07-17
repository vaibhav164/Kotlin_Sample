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

