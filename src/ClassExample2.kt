fun main(){
    val Car1 = Car("BMW", 564)
    println("${Car1.brand} max speed is ${Car1.maxSpeed}")

    Car1.carDetails("Hundai","Elactric")
}

class Car(var brand:String, var maxSpeed:Number) {

    fun carDetails( name:String, type:String){
        println("car is ${name} and fuel type is ${type}")
    }

}