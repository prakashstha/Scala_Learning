object Function {
  /*
  - Scala has function and method with same syntax
  - Methods are a part of a class
  - Function is an object, can be assigned to a variable
  - Scala is considered as a functional programming language
  - Anonymous function are called lambda function
  - Unit function do not have an equal sign
  */
  
  def abs(x: Int) = if (x<0) -x else x            //> abs: (x: Int)Int
  
  abs(-5)                                         //> res0: Int = 5
	
	def fact(n: Int) = {
		var res = 1
		for (i<-1 to n)
			res = res * i
		
		res // return statement
	}                                         //> fact: (n: Int)Int
	
	fact(5)                                   //> res1: Int = 120
	
	// Need to specify the return type in case of recursive function.
	def factRecursive(n: Int):Int = if (n == 0) 1 else n * factRecursive(n - 1)
                                                  //> factRecursive: (n: Int)Int
	factRecursive(5)                          //> res2: Int = 120
	
	// parameter can be initialized with a default value.
	def printName(left: String = "[", firstName: String, lastName: String, right: String = "]") {
		println(left + firstName + " " + lastName + right)
	}                                         //> printName: (left: String, firstName: String, lastName: String, right: String
                                                  //| )Unit
	
	printName(lastName = "Shrestha", firstName = "Prakash", right = ")")
                                                  //> [Prakash Shrestha)
	
	def sum(args:Int*)={
		var res = 0
		for (arg <- args) res = res + arg
		
		res
	}                                         //> sum: (args: Int*)Int
	
	sum(1, 2, 3, 5)                           //> res3: Int = 11
	sum(2, 1, 4, 5, 7)                        //> res4: Int = 19
}