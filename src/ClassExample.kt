fun main(){
    var Person1 = Person();

    Person1.CanVote();
    Person1.MakePersonAdult();
}

class Person {
    var IsAdult: Boolean = false

    fun CanVote(){
        if(IsAdult){
            println("Can Vote")
        }else{
            println("Can't Vote")
        }
    }

    fun MakePersonAdult(){
        IsAdult = true;
        CanVote();
    }
}