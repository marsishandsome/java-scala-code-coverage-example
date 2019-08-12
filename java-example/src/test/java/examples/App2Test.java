package examples;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class App2Test {
  private App2 app2;

  @Before
  public void setUp() {
    app2 = new App2();
  }

  @Test
  public void testAdd() {
    int a = 1;
    int b = 2;
    int result = app2.add(a, b);
    Assert.assertEquals(a + b, result);
  }

  @Test()
  public void testSubtract() {
    int a = 1;
    int b = 2;
    int result = app2.subtract(a, b);
    Assert.assertEquals(a - b, result);
  }

  @After
  public void tearDown() {
  }
}