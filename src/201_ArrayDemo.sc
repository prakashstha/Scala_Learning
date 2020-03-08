object ArrayDemo {
    var nums = new Array[Any](10)                 //> nums  : Array[Any] = Array(null, null, null, null, null, null, null, null, nu
                                                  //| ll, null)
	  var furniture = Array("chair", "sofa", "table", "bed")
                                                  //> furniture  : Array[String] = Array(chair, sofa, table, bed)
	  
	  for(f<-furniture)println(f)             //> chair
                                                  //| sofa
                                                  //| table
                                                  //| bed
	  println(furniture(0))                   //> chair
	  var a = 1 to 100                        //> a  : scala.collection.immutable.Range.Inclusive = Range 1 to 100
	  
	  var double = for(n <- a) yield 2*n      //> double  : scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10
                                                  //| , 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48
                                                  //| , 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86
                                                  //| , 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 118, 
                                                  //| 120, 122, 124, 126, 128, 130, 132, 134, 136, 138, 140, 142, 144, 146, 148, 1
                                                  //| 50, 152, 154, 156, 158, 160, 162, 164, 166, 168, 170, 172, 174, 176, 178, 18
                                                  //| 0, 182, 184, 186, 188, 190, 192, 194, 196, 198, 200)
	  
	  var even = for (n<-a if n%2 == 0) yield n
                                                  //> even  : scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 
                                                  //| 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 
                                                  //| 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 
                                                  //| 88, 90, 92, 94, 96, 98, 100)
}