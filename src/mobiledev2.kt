fun main() {
   name()
    var rem=modulas(10,3)
    println(rem)
    var result=add(25,78,67,89)
    println(result)
    fact()
}
fun name(){
    var name = "sharon"
    println ("Hello ${name}")
}
fun modulas(numA:Int,numB:Int,):Int{
    var modulas=(numA%numB)
    return modulas
}
fun add(a:Int,b:Int,c:Int,d:Int):Int {
    var sum=(a+b+c+d)
    return sum

}
fun fact() {
    var interesting ="I enjoy reading novels"
    println(interesting)
}