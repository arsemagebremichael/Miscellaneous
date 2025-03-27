fun main() {
    println("Enter the value:")
    var numbers = readln() !!.toInt()
    negativeOrPositive(numbers)
    evenOrOdd(numbers)
    checkGrade(numbers)
    leapyear(numbers)
}

fun negativeOrPositive(num: Int)
{

    if (num>0){
        println("It is a positive number.")
    }
    else if (num<0){
        println("It is a negative number.")
    }
    else{
        println("It is a zero.")
    }

}

fun evenOrOdd(num: Int)
{
    if(num%2==0){
            println("It is even number.")
    }
    else{
        println("It is odd number")
    }
}
fun checkGrade(num: Int) {
    if (num >= 90) {
        println("A")
    } else if (num >= 80) {
        println("B")
    } else if (num >= 70) {
        println("C")
    } else if (num >= 60) {
        println("D")
    } else {
        println("T for Tough.")
    }
}
fun leapyear(num: Int) {
    if (num % 400 == 0 ) {
        println("It is a leap year")
    } else if (num % 4 == 0 && num % 100 != 0) {
        println("It is a leap year")
    } else if (num % 100 == 0) {
        println("It is not a leap year")
    }
    else{
        println("It is not a leap year")
    }
}