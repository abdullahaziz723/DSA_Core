import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap <String ,String> map = new HashMap <>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println(map.get("key1")); // Output: value1
        System.out.println(map.get("key2")); // Output: value2
        System.out.println(map.get("key3")); // Output: null (key3 does not
        System.out.println("Size of map: " + map.size()); // Output: Size of map: 2
    }
}
