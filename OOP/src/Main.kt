import java.io.StringReader

fun main() {
    var subaru = Car("Sabaru", "Impreza", "KDQ 123T",0 )
    println(subaru)
    println(subaru.registration)
    println(subaru.model)
    subaru.start()
    println(subaru.speed)
    subaru.accelerate(22)
    println(subaru.speed)
    println(subaru.stop())
    subaru.hoot()
    subaru.decelerate(12)
    println(subaru.speed)

    val tv = TV()
    tv.channel = "Key"
    tv.switchOff()
    tv.switchOn()
}
class Car(var make:String, var model: String, var registration: String, var speed: Int){
    fun start(){
        println("Chiciciququq, Vroom Vroommmmmmmmmm")
    }
    fun accelerate(acceleration: Int){
        speed +=acceleration
    }
    fun deccelerate(deceleration: Int){
        speed -= deceleration
    }
    fun hoot(){
        println("pop, pop")
    }
    fun stop(){
        speed = 0
    }
    fun decelerate(deceleration: Int){
        speed -= deceleration
    }
}

class TV(){
    var channel = ""
    fun switchOn(){
        println("onn")
    }
    fun switchOff(){
        println("off")
    }
}
