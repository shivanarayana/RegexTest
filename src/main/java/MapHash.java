import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapHash {

    public static void printValues() {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "vishal");
        map.put(30, "sachin");
        map.put(20, "vaibhav");

        System.out.println("Size of map is:- " + map.size());

        // Printing elements in object of Map
        System.out.println(map);
        List<String> hashString = new ArrayList<String>();

        for (int i = 1; i <= map.size(); i++) {
            hashString.add(String.valueOf(map.get(i * 10)));
        }
        System.out.println("-----------------");
        System.out.println(hashString);

        for (String hashstringOne : hashString) {
            System.out.println("******String has a sub string*****");
            if (hashstringOne.contains("ha")) {
                System.out.println(hashstringOne);
            }
        }
    }
}