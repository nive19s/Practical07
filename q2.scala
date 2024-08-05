object SquareCalculate{
    def calculateSquare(num : List[Int]): List[Int]={
        num.map(num => num*num)
    }

    def main(args : Array[String]): Unit = {
        val input = List(1,2,3,4,5)
        val squaredlist = calculateSquare(input)
        println("input -> " + input)
        println("Output -> " + squaredlist)
    }
}