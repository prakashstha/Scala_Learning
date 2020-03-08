import io.Source._

object FileInputDemo extends App{
  var filename = "src/rainbow.txt"
  for (line <- fromFile(filename).getLines()){
    println(line.toUpperCase())
  }
  
  val poemLines = fromFile(filename).getLines().toList
  poemLines.foreach(println)
  
}