import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringGame {
    public void StartGame() {
        String s1 = "string";//creating string by Java string literal
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);

        List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");
        int lengthCities = cities.size();
        List aList = new ArrayList();
        aList.add("Apple");
        aList.add("Mango");
        aList.add("Guava");
        aList.add("Orange");
        aList.add("Peach");

        try {
            for (int i = 0; i < 10; i++) {
                if ((cities.get(i)).contains("Syd")) {
                    System.out.println("It contains data Syd"); // contains Syd
                } else {
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException aIOBE) {
            System.out.println("Its a ArrayIndexOutOfBoundsException" + aIOBE);
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }

        Stream<String> cityStream = Stream.of("Sydney", "Dhaka", "New York", "London");

        for (int i = 0; i < 10; i++) {

        }

        cityStream.forEach((n) -> {
            System.out.println(n);
        });
//    public int getLengthCities() {
//        return lengthCities;
//    }
//    System.out.print("length" + lengthCities.getLengthCities())
    }
}
