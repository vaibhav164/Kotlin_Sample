fun main(){
    val user1 =User("Vaibhav",29,"male")

    user1.showUserDetail()
}

class User(name:String,age:Number, gender:String){

       private var userName = name
        private var userAge = age
        private var userGender = gender

        fun showUserDetail(){
            println("${userName} age is ${userAge} and is ${userGender}")
        }

}