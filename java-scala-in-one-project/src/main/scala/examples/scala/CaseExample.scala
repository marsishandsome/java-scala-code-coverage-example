package examples.scala

case class CaseExample(
    greeting: String = "Hello",
    name: String = "world") {
  def sayHello() {
    println(s"${greeting} ${name}")
  }
}
