package examples.java

import org.scalatest.FunSpec

class AppSpec extends FunSpec {
  describe("App") {
    it("should work") {
      val app = new App
      app.add(1, 2)
      app.subtract(2, 1)
    }

    describe("App2") {
      it("should work") {
        val app2 = new App2
        app2.add(1, 2)
        app2.subtract(2, 1)
      }
    }
  }
}