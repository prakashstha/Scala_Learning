

object ClassDemo extends App {
  var e1 = new Employee("Prakash", "Shrestha")
  var e2 = new Employee("Rojina", "Shrestha", 'y')
  
  println(e1)
  println(e2)
}

class Employee(val fName:String, val lName: String, var salaried:Char = 'n'){
  def fullName = fName + " " + lName
  
  var empID = Employee.newEmpID
  
  override def toString = "Employee Name: " + fullName + 
  "\nEmployee ID: " + empID +  
  (if (salaried == 'n') "\nHourly Employee" else "\nFull Time Employee")+
  "\n" + "="*20
  
}


// Singleton Object: Class that enables only one instance of the class, similar to using static class in Java.
object Employee{
  var empID = 0
  
  def newEmpID = {
    empID += 1
    empID
  }
}