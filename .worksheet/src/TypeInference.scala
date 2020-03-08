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
  
  
object TypeInference {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(794); 
  println("Welcome to the Scala worksheet");$skip(40); 
  
  // mutable variables
  var num = 1;System.out.println("""num  : Int = """ + $show(num ));$skip(20); 
  var decimal = 3.5;System.out.println("""decimal  : Double = """ + $show(decimal ));$skip(22); 
  var x = 1 + 2 + 3.5;System.out.println("""x  : Double = """ + $show(x ));$skip(57); 
  
  //immutable variables
  val list1 = List(1, 2, 3.5);System.out.println("""list1  : List[Double] = """ + $show(list1 ));$skip(28); 
  val list2 = List(1, true);System.out.println("""list2  : List[AnyVal] = """ + $show(list2 ));$skip(39); 
  val list3 = List(1, true, "Prakash");System.out.println("""list3  : List[Any] = """ + $show(list3 ));$skip(64); 
  
  // type inference in functions
  def addOne(a:Int) = a + 1;System.out.println("""addOne: (a: Int)Int""");$skip(56); 
  def function1(x: Int) = if (x>0) true else "Negative";System.out.println("""function1: (x: Int)Any""");$skip(12); val res$0 = 
  addOne(2);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  function1(5);System.out.println("""res1: Any = """ + $show(res$1));$skip(49); 
  
  //mutable variables
  var a = 10.toString();System.out.println("""a  : String = """ + $show(a ));$skip(50); 
  
  // to is inclusive range
  var b = 10.to(20);System.out.println("""b  : scala.collection.immutable.Range.Inclusive = """ + $show(b ));$skip(19); 
  var c = 10 to 20;System.out.println("""c  : scala.collection.immutable.Range.Inclusive = """ + $show(c ));$skip(25); 
  
  
  var d = 10.+(11);System.out.println("""d  : Int = """ + $show(d ));$skip(18); 
  var e = 10 + 11;System.out.println("""e  : Int = """ + $show(e ));$skip(23); 
  
  var f = 97.toChar;System.out.println("""f  : Char = """ + $show(f ));$skip(22); 
  var g = 85.96.toInt;System.out.println("""g  : Int = """ + $show(g ));$skip(17); 
  
  a += " ten";$skip(13); 
  println(a)}
  
  
  
}
