object SetDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
	val fruit = Set("apple", "orange", "banana");System.out.println("""fruit  : scala.collection.immutable.Set[String] = """ + $show(fruit ));$skip(43); 
  var moreFruit = Set("kiwi", "pineapple");System.out.println("""moreFruit  : scala.collection.immutable.Set[String] = """ + $show(moreFruit ));$skip(28); 
  var nums = Set(1,2,3,4,5);System.out.println("""nums  : scala.collection.immutable.Set[Int] = """ + $show(nums ));$skip(33); 
  var moreNums = Set(1, 7, 8, 9);System.out.println("""moreNums  : scala.collection.immutable.Set[Int] = """ + $show(moreNums ));$skip(22); val res$0 = 
  
  nums.contains(5);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(10); val res$1 = 
  nums(3);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(79); 
  
  // combines two sets of different data types.
  var mixed = fruit ++ nums;System.out.println("""mixed  : scala.collection.immutable.Set[Any] = """ + $show(mixed ));$skip(48); 
  // remove an element from the set
  nums -= 5;$skip(16); 
  println(nums);$skip(60); 
  
  // intersection of two sets
  println(nums & moreNums);$skip(32); 
  
  
  println(moreFruit.head);$skip(16); val res$2 = 
	moreFruit.tail;System.out.println("""res2: scala.collection.immutable.Set[String] = """ + $show(res$2));$skip(21); val res$3 = 
	
	moreFruit.isEmpty;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(29); 
	
	moreNums.foreach(println)}
}
