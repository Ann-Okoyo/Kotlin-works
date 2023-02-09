fun main(){


//naming()
    var result= div(46.4, 5.5)
    println(result)
    fact("Ann")

}


//fun naming() {
//    var name ="Ada"
//    println("Hello"+ "  " + name)
//}

fun div(num1: Double, num2: Double): Double {
     var division =num1 % num2
     return division
}
fun add(num1: Int, num2: Int,num3:Int,num4:Int){
    var sum = num1 + num2 + num3 + num4
    println(sum)


}
fun fact(me:String){
    println(me)
}