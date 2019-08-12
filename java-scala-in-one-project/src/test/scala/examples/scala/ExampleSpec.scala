package examples.scala

import org.scalatest.FunSpec

class ExampleSpec extends FunSpec {
  describe("A Canary") {
    it("should cover a class that mixes in a trait") {
      val traitExample = new TraitExample
      traitExample.sayHello()
      traitExample.thisIsMixedIn()
    }
    
    it("should cover a case class") {
      val caseExample = new CaseExample
      caseExample.sayHello()
    }

    it("should cover if") {
      val ifExample = new IfExample
      ifExample.call(-1 :: -2 :: Nil)
    }
  }
}