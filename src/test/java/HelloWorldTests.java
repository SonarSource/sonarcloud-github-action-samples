import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTests {
  @Test
  void sayHello() {
    assertEquals("hello world1", new HelloWorld().say());
  }
}
