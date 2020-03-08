object Decision {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(40); 
	var today = "Tuesday";System.out.println("""today  : String = """ + $show(today ));$skip(85); 
	
	if (today == "Monday") println("It might rain") else println("It would be sunny");$skip(13); 

	var a = -5;System.out.println("""a  : Int = """ + $show(a ));$skip(30); 
	
	var b = if (a<0) -1 else 1;System.out.println("""b  : Int = """ + $show(b ));$skip(12); 
	println(b);$skip(60); 
	
	
	println(if (a<0) "-" else if (a == 0) "zero" else "+");$skip(19); 
  var rate = 10.50;System.out.println("""rate  : Double = """ + $show(rate ));$skip(229); 
  
  def earnings(s:String, hr: Int): String = {
  		if (s != "y"){
  			if (hr<=40) "Salary is $ " + hr * rate
  			else {"Salary is $" + 40 * hr + (hr - 40) * rate * 1.5}
  		}else{
  			"This is a salaried employee"
  		}
  };System.out.println("""earnings: (s: String, hr: Int)String""");$skip(32); 
  
  println(earnings("n", 30));$skip(29); 
  println(earnings("n", 50));$skip(29); 
  println(earnings("y", 30))}
          
}
