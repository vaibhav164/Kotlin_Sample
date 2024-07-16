fun main(){
    val user1 =User("Vaibhav",29,"male")

    user1.showUserDetail()
}

class User(name:String,age:Number, gender:String){
//in above we can se the name , age and gender is created without using var or val
//and these are not property User the property User are userName, userAge, userGender
       private var userName = name
        private var userAge = age
        private var userGender = gender
    init{
        println("${userName} is inside Init Block")
    }
        fun showUserDetail(){
            println("${userName} age is ${userAge} and is ${userGender}")
        }

}