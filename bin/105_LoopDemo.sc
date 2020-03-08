object LoopDemo {
	var x = 5                                 //> x  : Int = 5
	
	while (x>=0){
		println(x)
		x -= 1
	}                                         //> 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
	
	
	do{
		println(x)
		x -= 1
	}while(x>=0)                              //> -1
	
  for (x<-10 to 0 by -1){
  	   println(x)                             //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
  }
  
  println("BlastOff!")                            //> BlastOff!
	
	
	for (x<-1 to 10 by 2) yield x             //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 3, 5, 7, 9)


	var word = "Prakash" // print each letter in one line
                                                  //> word  : String = Prakash
	for (i <- 0 until word.length){		println(word(i)) }
                                                  //> P
                                                  //| r
                                                  //| a
                                                  //| k
                                                  //| a
                                                  //| s
                                                  //| h
	
}