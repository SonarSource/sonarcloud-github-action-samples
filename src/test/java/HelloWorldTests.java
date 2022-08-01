import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTests {
  @Test
  void sayHello() {
    assertEquals("hello world", new HelloWorld().say());
  }
}

class Testing {
  @Test
  void sayTest() {
    assertEquals("Testing", new Test().say());
  }
}