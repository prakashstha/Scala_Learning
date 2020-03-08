/*
- Scala variable can be declared without data type if it contains initialization value.
-
- All the data type in Scala point all the way up to the type "Any"
- "Any" has two branches -- AnyVal and AnyRef
- Data type hierarchy in Scala is as shown below
  Any
  |---AnyVal
  |			|
  |			|---Double, Float, Int, Short, Byte <--- Conversion direction for inference.
  |			|---	------------------- Char >> Char is just below the Int in the Hierarchy.
  	|			|---Unit
  |			|---Boolean
  |
  |---AnyRef
  				|
  				|---Object
  				|---Sequence
  				|---List
  				|---String
  
  - Short + Int --> Int
  - Boolean + Int (or any other numerical value) --> AnyVal
  - Data type from AnyVal + Data type AnyRef --> Any
  */
  
  
object TypeInference {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // mutable variables
  var num = 1                                     //> num  : Int = 1
  var decimal = 3.5                               //> decimal  : Double = 3.5
  var x = 1 + 2 + 3.5                             //> x  : Double = 6.5
  
  //immutable variables
  val list1 = List(1, 2, 3.5)                     //> list1  : List[Double] = List(1.0, 2.0, 3.5)
  val list2 = List(1, true)                       //> list2  : List[AnyVal] = List(1, true)
  val list3 = List(1, true, "Prakash")            //> list3  : List[Any] = List(1, true, Prakash)
  
  // type inference in functions
  def addOne(a:Int) = a + 1                       //> addOne: (a: Int)Int
  def function1(x: Int) = if (x>0) true else "Negative"
                                                  //> function1: (x: Int)Any
  addOne(2)                                       //> res0: Int = 3
  function1(5)                                    //> res1: Any = true
  
  //mutable variables
  var a = 10.toString()                           //> a  : String = 10
  
  // to is inclusive range
  var b = 10.to(20)                               //> b  : scala.collection.immutable.Range.Inclusive = Range 10 to 20
  var c = 10 to 20                                //> c  : scala.collection.immutable.Range.Inclusive = Range 10 to 20
  
  
  var d = 10.+(11)                                //> d  : Int = 21
  var e = 10 + 11                                 //> e  : Int = 21
  
  var f = 97.toChar                               //> f  : Char = a
  var g = 85.96.toInt                             //> g  : Int = 85
  
  a += " ten"
  println(a)                                      //> 10 ten
  
  
  
}