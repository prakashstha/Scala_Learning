object LoopDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(28); 
	var x = 5;System.out.println("""x  : Int = """ + $show(x ));$skip(42); 
	
	while (x>=0){
		println(x)
		x -= 1
	};$skip(45); 
	
	
	do{
		println(x)
		x -= 1
	}while(x>=0);$skip(45); 
	
  for (x<-10 to 0 by -1){
  	   println(x)
  };$skip(30); 
  
  println("BlastOff!");$skip(35); val res$0 = 
	
	
	for (x<-1 to 10 by 2) yield x;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$0));$skip(57); 


	var word = "Prakash";System.out.println("""word  : String = """ + $show(word ));$skip(53);  // print each letter in one line
	for (i <- 0 until word.length){		println(word(i)) }}
	
}
