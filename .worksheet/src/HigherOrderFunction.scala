/*
- A function that takes a function as a parameter or return a function is called higher order function.
- First-order function only takes data items
*/
object HigherOrderFunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(318); 
	/*	============================================
	 Function that takes a function as a parameter.
	 */
	val double = (i: Int) => i * 2;System.out.println("""double  : Int => Int = """ + $show(double ));$skip(146); 
	
	// the function takes an integer value and a function, and applies the function to the value.
	def higherOrderFxn(x: Int, y:Int => Int) = y(x);System.out.println("""higherOrderFxn: (x: Int, y: Int => Int)Int""");$skip(29); val res$0 = 
	
	higherOrderFxn(5, double);System.out.println("""res0: Int = """ + $show(res$0));$skip(32); 
	
	val triple = (i: Int) => i*3;System.out.println("""triple  : Int => Int = """ + $show(triple ));$skip(29); val res$1 = 
	
	higherOrderFxn(5, triple);System.out.println("""res1: Int = """ + $show(res$1));$skip(223); 
	
	
	/*============================================
	 Function that returns a function.
	 */
	 
	 // function that returns a function that takes a string as an argument.
	 def sayHello = (x: String) => println("Hello" + x);System.out.println("""sayHello: => String => Unit""");$skip(22); 
	 sayHello("Prakash");$skip(16); 
	
	
	 val y = 5;System.out.println("""y  : Int = """ + $show(y ));$skip(37); 
	 val multiplier = (x: Int) => x * y;System.out.println("""multiplier  : Int => Int = """ + $show(multiplier ));$skip(19); val res$2 = 
	 
	 multiplier(3);System.out.println("""res2: Int = """ + $show(res$2))}
}
