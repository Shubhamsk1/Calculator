import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testHelloWorld() {
        String message = "Hello, World!";
        assertEquals("Hello, World!", message, "The message should be 'Hello, World!'");
    }
}