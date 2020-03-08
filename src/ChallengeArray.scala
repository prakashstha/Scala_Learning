

object ChallengeArray extends App {
  def avg(arr: Array[Int]) = {
    var s = 0
    
    for(v<-arr) yield s += v
    
    s/arr.length
    
  }
  
  var min = (arr:Array[Int]) =>{
    var m  = arr(0)
    
    for(v<-arr) if (v<m) m = v 
    
    m
  }
  
  var max = (arr:Array[Int]) =>{
    var m = arr(0)
    
    for (v<-arr) if (v>m) m = v
    
    m
  }
  
  var arr = Array(1, 4, 2, 7, 3, 9, 50)
  
  println("Average is: " + avg(arr))
  println("Minimum is: " + min(arr))
  println("Maximum is: " + max(arr))
}