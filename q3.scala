object PrimeFilter{
    def isPrime(num: Int) : Boolean = {
        num match{
            case n if n <= 1 => false
            case 2 => true
            case n if n%2 == 0 => false
            case _ => !(3 to math.sqrt(num).toInt by 2).exists(i => num % i == 0)
          //This generates odd numbers starting from 3 up to the integer value of the square root of num
    //exists(i => num % i == 0) checks if any of these numbers can divide num without a remainder. If such a divisor exists, num is not prime.
        }
    }

    def filterPrime(num : List[Int]): List[Int] = {
        num.filter(num => isPrime(num))
    }
    def main(args : Array[String]): Unit ={
        val inputlist = List(1,2,3,4,5,6,7,8,9,10)
        val primeNumbers = filterPrime(inputlist)
        println("Input List -> " + inputlist)
        println("Prime Numbers List -> " + primeNumbers)
    }
}