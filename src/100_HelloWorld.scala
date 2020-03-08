object HelloWorld{
  def main(args: Array[String]):Unit = {
    // This is my first Scala program
    println("Hello World!") 
    
    // var indicates mutable object
    var firstName: String = "Prakash" 
    
    //val indicates immutable object
    val age: Int = 21
    println(firstName + " is " + age + " year old.")
    
    //Unit is equivalent of void in Java.
    def function1(): Unit = {
      println("This is my first function")
    }
    
    function1()
    
  }
}