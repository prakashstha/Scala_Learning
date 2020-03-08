object Decision {
	var today = "Tuesday"                     //> today  : String = Tuesday
	
	if (today == "Monday") println("It might rain") else println("It would be sunny")
                                                  //> It would be sunny

	var a = -5                                //> a  : Int = -5
	
	var b = if (a<0) -1 else 1                //> b  : Int = -1
	println(b)                                //> -1
	
	
	println(if (a<0) "-" else if (a == 0) "zero" else "+")
                                                  //> -
  var rate = 10.50                                //> rate  : Double = 10.5
  
  def earnings(s:String, hr: Int): String = {
  		if (s != "y"){
  			if (hr<=40) "Salary is $ " + hr * rate
  			else {"Salary is $" + 40 * hr + (hr - 40) * rate * 1.5}
  		}else{
  			"This is a salaried employee"
  		}
  }                                               //> earnings: (s: String, hr: Int)String
  
  println(earnings("n", 30))                      //> Salary is $ 315.0
  println(earnings("n", 50))                      //> Salary is $2000157.5
  println(earnings("y", 30))                      //> This is a salaried employee
          
}