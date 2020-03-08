object ArrayDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(52); 
    var nums = new Array[Any](10);System.out.println("""nums  : Array[Any] = """ + $show(nums ));$skip(58); 
	  var furniture = Array("chair", "sofa", "table", "bed");System.out.println("""furniture  : Array[String] = """ + $show(furniture ));$skip(35); 
	  
	  for(f<-furniture)println(f);$skip(25); 
	  println(furniture(0));$skip(20); 
	  var a = 1 to 100;System.out.println("""a  : scala.collection.immutable.Range.Inclusive = """ + $show(a ));$skip(42); 
	  
	  var double = for(n <- a) yield 2*n;System.out.println("""double  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(double ));$skip(49); 
	  
	  var even = for (n<-a if n%2 == 0) yield n;System.out.println("""even  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(even ))}
}
