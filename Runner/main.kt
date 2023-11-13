// args : Array<String>
// fun sum(a : Int, b : Int) : Int { return a + b; }
fun birthdayGreeting(name : String = "rover", age : Int) : String {
    var name_ = "Happy Birthday, $name!";
    val age_ = "You are now $age years old!";
    return "$name_\n$age_";
}

fun main() {
    println(birthdayGreeting(age = 9, name = "小李"));
    println(birthdayGreeting(age = 6));
}
