import scala.collection.parallel.CollectionConverters._

object main {
  def main(args: Array[String]): Unit = {

    //Question Scala Exercise

    val arrayA = Array(Array(3,6,1,3),Array(7,1,8,2),Array(9,1,6,1),Array(5,9,3,1))
    val arrayB = Array(Array(7,3,1,2),Array(4,3,1,5),Array(7,3,3,1),Array(3,2,6,2))


    //Question A
    var newArray = new Array[Int](4)

    //Question B
    newArray = for ((a,b) <- arrayA zip arrayB) yield a.sum + b.sum
    println(s"New Array: ${newArray.mkString("Array(", ", ", ")")}")

    //Question C & Question D(Parallel Execution: It may help huge collections from processing information quicker)
    val average = newArray.par.sum.toDouble / newArray.length
    println(s"Average: $average")


  }

}
