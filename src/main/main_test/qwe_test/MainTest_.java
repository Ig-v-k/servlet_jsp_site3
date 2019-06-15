import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MainTest_ {
    @Test
    public static void main(String[] args)
    {
        MainTest mainTest = () ->
                MainTest.a.put("a", "A");
                MainTest.a.put("b", "B");
                MainTest.a.put("c", "C");
                MainTest.a.put("d", "D");
                for (Map.Entry<String, String> e : MainTest.a.entrySet()) {
                    System.out.println(e);
                }
    }
}
