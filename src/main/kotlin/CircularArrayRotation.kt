fun main() {
    println(findSimpleIndex(4, 3, 3))
}


fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    // Write your code here

    return Array(3) { 3 }
}

fun findSimpleIndex(sizeOfArray: Int, indexPos: Int, rotations: Int): Int {
    var newSimpleIndex = indexPos + rotations
    if(newSimpleIndex > sizeOfArray-1){
        while(newSimpleIndex >=sizeOfArray-1){
            newSimpleIndex-= sizeOfArray
        }
    }
    return newSimpleIndex
}
