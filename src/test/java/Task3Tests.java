import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.example.task3.Proxy;
import com.example.task3.RealImage;


public class Task3Tests {
    @Test
    public void testAllArguments() {
      Proxy proxy = new Proxy();
      Assertions.assertEquals(proxy.generate_frame("new"), "created new obj");
      Assertions.assertEquals(proxy.generate_frame("new"), "from cache using proxy");
      Assertions.assertEquals(proxy.generate_frame("another"), "created new obj");
    }
   

}