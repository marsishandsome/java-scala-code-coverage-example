package examples

class IfExample {
  def call(l: List[Int]): Unit = {
    l.filter(_ > 0).filter(_ < 42).takeWhile(_ != 3).foreach(println(_))
  }
}
