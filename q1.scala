object EvenNumberFilter{
    def filterEvenNumbers(nums: List[Int]): List[Int] ={
        nums.filter(nums => nums % 2 == 0)
}

def main(args: Array[String]): Unit={
    val inputlist = List(1,2,3,4,5,6,7,8,9,10)
    val evenNumbers = filterEvenNumbers(inputlist)
    println("Initial List -> " + inputlist)
    println("List with even Numbers -> " + evenNumbers)
}   
}