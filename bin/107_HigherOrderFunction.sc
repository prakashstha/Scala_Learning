/*
- A function that takes a function as a parameter or return a function is called higher order function.
- First-order function only takes data items
*/
object HigherOrderFunction {
	/*	============================================
	 Function that takes a function as a parameter.
	 */
	val double = (i: Int) => i * 2            //> double  : Int => Int = HigherOrderFunction$$$Lambda$3/1389133897@7aec35a
	
	// the function takes an integer value and a function, and applies the function to the value.
	def higherOrderFxn(x: Int, y:Int => Int) = y(x)
                                                  //> higherOrderFxn: (x: Int, y: Int => Int)Int
	
	higherOrderFxn(5, double)                 //> res0: Int = 10
	
	val triple = (i: Int) => i*3              //> triple  : Int => Int = HigherOrderFunction$$$Lambda$9/1209271652@58ceff1
	
	higherOrderFxn(5, triple)                 //> res1: Int = 15
	
	
	/*============================================
	 Function that returns a function.
	 */
	 
	 // function that returns a function that takes a string as an argument.
	 def sayHello = (x: String) => println("Hello" + x)
                                                  //> sayHello: => String => Unit
	 sayHello("Prakash")                      //> HelloPrakash
	
	
	 val y = 5                                //> y  : Int = 5
	 val multiplier = (x: Int) => x * y       //> multiplier  : Int => Int = HigherOrderFunction$$$Lambda$11/985922955@1e643fa
                                                  //| f
	 
	 multiplier(3)                            //> res2: Int = 15
}