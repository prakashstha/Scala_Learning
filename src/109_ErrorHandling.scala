
import java.io._
import io.Source._
object ErrorHandling extends App {
  
  try{
    for (line<-fromFile("noFile.txt").getLines())
      println(line.toLowerCase())  
  }catch{
    case e:FileNotFoundException => println("The file was not found.")
    
    case _: Exception => println("Your program has a bug!")
  }
  
  try{
    var quotient = 10/0
    
  }catch{
    case e:ArithmeticException => println("Divide by zero error")
  }
  
}