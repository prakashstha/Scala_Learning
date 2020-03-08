object ListDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(43); 
var l = List(3.0, 5, 'a');System.out.println("""l  : List[Double] = """ + $show(l ));$skip(30); 
  var l2 = 1::2::3::4::5::Nil;System.out.println("""l2  : List[Int] = """ + $show(l2 ));$skip(30); 
  var l3 = List.range(10, 20);System.out.println("""l3  : List[Int] = """ + $show(l3 ));$skip(18); 
  var l4 = l:::l2;System.out.println("""l4  : List[AnyVal] = """ + $show(l4 ));$skip(17); 
  
  var sum = 0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(21); 
  l3.foreach(sum+=_);$skip(15); 
  println(sum);$skip(39); 
  val list = List((1,2), (3,4), (5,6));System.out.println("""list  : List[(Int, Int)] = """ + $show(list ));$skip(29); val res$0 = 
  for((a,b)<-list) yield a+b;System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
