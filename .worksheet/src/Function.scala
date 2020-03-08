object Function {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(366); 
  /*
  - Scala has function and method with same syntax
  - Methods are a part of a class
  - Function is an object, can be assigned to a variable
  - Scala is considered as a functional programming language
  - Anonymous function are called lambda function
  - Unit function do not have an equal sign
  */
  
  def abs(x: Int) = if (x<0) -x else x;System.out.println("""abs: (x: Int)Int""");$skip(13); val res$0 = 
  
  abs(-5);System.out.println("""res0: Int = """ + $show(res$0));$skip(105); 
	
	def fact(n: Int) = {
		var res = 1
		for (i<-1 to n)
			res = res * i
		
		res // return statement
	};System.out.println("""fact: (n: Int)Int""");$skip(11); val res$1 = 
	
	fact(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(146); 
	
	// Need to specify the return type in case of recursive function.
	def factRecursive(n: Int):Int = if (n == 0) 1 else n * factRecursive(n - 1);System.out.println("""factRecursive: (n: Int)Int""");$skip(18); val res$2 = 
	factRecursive(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(208); 
	
	// parameter can be initialized with a default value.
	def printName(left: String = "[", firstName: String, lastName: String, right: String = "]") {
		println(left + firstName + " " + lastName + right)
	};System.out.println("""printName: (left: String, firstName: String, lastName: String, right: String)Unit""");$skip(72); 
	
	printName(lastName = "Shrestha", firstName = "Prakash", right = ")");$skip(86); 
	
	def sum(args:Int*)={
		var res = 0
		for (arg <- args) res = res + arg
		
		res
	};System.out.println("""sum: (args: Int*)Int""");$skip(19); val res$3 = 
	
	sum(1, 2, 3, 5);System.out.println("""res3: Int = """ + $show(res$3));$skip(20); val res$4 = 
	sum(2, 1, 4, 5, 7);System.out.println("""res4: Int = """ + $show(res$4))}
}
