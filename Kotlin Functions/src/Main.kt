fun main() {
    //Check if number is positive or negative
    println("Enter the value:")
    var numbers = readln().toInt()
    negativeOrPositive(numbers)

    //Check if number is odd or even
    println("Enter the value:")
    var number1 = readln().toInt()
    evenOrOdd(number1)

    //Check grades
    println("Enter your grade:")
    var grade = readln().toInt()
    checkGrade(grade)

    //Check for leap year
    println("What year do you want to check for leap year:")
    var leapYear = readln().toInt()
    leapyear(leapYear)

    //Check your discounted price
    println("Enter the total price:")
    var discountCheck = readln().toDouble()
    discountCalculator(discountCheck)
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
fun discountCalculator(price: Double){
    var discount: Double
    if (price>=10000){
         discount = price *0.2
        println("Payment after discount is:".plus(price-discount) )
    }
    else if (price>= 5000){
        discount = price*0.1
        println("Payment after discount is:".plus(price-discount) )
    }
    else{
        discount = 0.00
        println("Payment after discount is:".plus(price-discount) )
    }
}