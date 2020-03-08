

object PatternMatchingDemo extends App {
  
  def greekAlphabet(letter:Char) ={
    letter match{
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
        
      case _ => "No Greek"
    }
  }
  
  println("Greek of letter A is: " + greekAlphabet('C'))
  
  
  def max(x: Int, y: Int) = x>y match{
      case true => x
      case false => y
  }
  
  println(max(5, 6))
  
  
}