object MapDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
  var groceries = Map(1 -> "milk", 2 -> "bread", 3 -> "juice", 4 ->"eggs");System.out.println("""groceries  : scala.collection.immutable.Map[Int,String] = """ + $show(groceries ));$skip(41); 
	groceries = groceries+(5->"hashbrowns");$skip(18); val res$0 = 
	groceries.get(3);System.out.println("""res0: Option[String] = """ + $show(res$0));$skip(14); val res$1 = 
	groceries(3);System.out.println("""res1: String = """ + $show(res$1));$skip(35); val res$2 = 
	groceries.getOrElse(6,"No Match");System.out.println("""res2: String = """ + $show(res$2));$skip(45); 
	
	
	
	for(v<-groceries.values)
		println(v);$skip(75); 
	//reverse the key-value pairs.
	var z = for((k,v)<-groceries) yield (v,k);System.out.println("""z  : scala.collection.immutable.Map[String,Int] = """ + $show(z ));$skip(37); 
	
	
	groceries.keys.foreach(println);$skip(49); 
	for(k<-groceries.keys){
		println(groceries(k))
	};$skip(31); 
	groceries.foreach(println)}
}
