fun main() {
    var array = arrayOf(28,3,6,5,7,8,9)
    var counter = 0
    for (element in array){
        if (element %2 !=0)
            counter ++
    }
    println(" There are $counter  odds number in the array")
}