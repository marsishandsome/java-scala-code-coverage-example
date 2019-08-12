package examples;

import java.util.Random;

class App {
  int add(int a, int b) {
    boolean tag = new Random().nextBoolean();
    if (tag) {
      a += 1;
    } else {
      a += 2;
    }
    return a + b;
  }

  int subtract(int a, int b) {
    return a - b;
  }
}
