fun main(){
val Girl1 = Girl()
    Girl1.ActualAge = 10
    Girl1.age = 10
    println("Girl1 ActualAge ${Girl1.ActualAge}")
    println("Girl1 age is ${Girl1.age}")

    val Girl2 =Girl()
    Girl2.ActualAge = 47
    Girl2.age=47
    println("Girl2 actualAge ${Girl2.ActualAge}")
    println("Girl2 age is ${Girl2.age}")
}

class Girl(){
    var age:Int=0
        get()=field;
        set(value){
            field = if (value < 18)
                18
            else if(value >=18 && value <= 30)
                value
            else
                value-3
        }
    var ActualAge:Int = 0
}