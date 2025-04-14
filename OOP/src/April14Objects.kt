import java.awt.Color

fun main(){
 val myShoes = Shoe("Nike", "White", 40,  "Sneaker")
 val shoes = Shoe("Hush puppies", "Black", 43, "oxford")
 println(shoes.size)
 println(shoes.brand)
 println(shoes.style)
 println(myShoes.color)
  var a= arrayOf(10, 5, 7, 9, 9)
  println(multipleReturn(a))
 var result = multipleReturn(arrayOf(1,2,3,4,5,6,7,8,9))
 result.minimun
 result.maximum
 result.avg

}

//Data class
//Data classes hold values for us
data class Shoe(
 var brand: String,
 var color: String,
 var size: Int,
 var style: String
)


//Write a function that returns the average, minimun and maximum value from an integer array
data class Values(
 var maximum: Int,
 var minimun: Int,
 var avg: Double

)
fun multipleReturn(arr: Array<Int>): Values{
 val max = arr.max()
 val min =arr.min()
 val avg = arr.average()
 val values = Values(min, max, avg)

return values
}
//

