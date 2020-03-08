object TupleDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(48); 
    val v = (1, 1.4, "Hello");System.out.println("""v  : (Int, Double, String) = """ + $show(v ));$skip(99); 
	  // accessing elements in a set.
	  // Index starts with 1 unlike list and array
	  var x = v._3;System.out.println("""x  : String = """ + $show(x ));$skip(41); 
	  
	  
	  val(first, second, third) = v;System.out.println("""first  : Int = """ + $show(first ));System.out.println("""second  : Double = """ + $show(second ));System.out.println("""third  : String = """ + $show(third ));$skip(42); 
	  
	  val symbols = Array("<", "-", ">");System.out.println("""symbols  : Array[String] = """ + $show(symbols ));$skip(34); 
	  
	  val counts = Array(2,10,2);System.out.println("""counts  : Array[Int] = """ + $show(counts ));$skip(84); 
	  
	  // creates a pairs/tuples from two Array.
	  val pairs = symbols.zip(counts);System.out.println("""pairs  : Array[(String, Int)] = """ + $show(pairs ));$skip(43); 
	  
	  for((s,n) <- pairs)
	  		print(s*n);$skip(62); 
	  
	  def divide10(n:Int):Tuple2[Int, Int] =
	  	(n/10,n%10);System.out.println("""divide10: (n: Int)(Int, Int)""");$skip(32); 
	  val(tens,ones) = divide10(9);System.out.println("""tens  : Int = """ + $show(tens ));System.out.println("""ones  : Int = """ + $show(ones ))}
	      
}
