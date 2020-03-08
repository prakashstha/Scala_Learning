object worksheet1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var x = 5                                       //> x  : Int = 5
  val str = "Scala Rocks!"                        //> str  : String = Scala Rocks!
  var ods = List(1, 3, 5, 7, 9)                   //> ods  : List[Int] = List(1, 3, 5, 7, 9)
  2 to 10                                         //> res0: scala.collection.immutable.Range.Inclusive = Range 2 to 10
  
  var y = true                                    //> y  : Boolean = true
  val pi = 3.1415                                 //> pi  : Double = 3.1415
  
  def add(num1: Int, num2: Int) = num1 + num2     //> add: (num1: Int, num2: Int)Int
  add(4, 5)                                       //> res1: Int = 9
}