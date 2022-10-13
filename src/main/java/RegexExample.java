import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^Redemption amount \\$ (?!(?:\\d{1,2}|100)$)[0-9]\\d+(\\.\\d{1,2})? is greater than Max Redemption amount \\$ 100.0.$");

        Pattern pattern2 = Pattern.compile(".*is greater than Max Redemption amount.*");

        Matcher matcher = pattern.matcher("Redemption amount $ 106.32 is greater than Max Redemption amount $ 100.0.");

        String input = "Redemption amount $ 106.32 is greater than Max Redemption amount $ 100.0.";
        // System.out.println(input.contains("is greater than Max Redemption amount"));
        // System.out.println("contains");

        Matcher matcher2 = pattern2.matcher(input);

        // System.out.println(matcher2.find());
        // System.out.println();

        if (matcher2.matches()) {
            // System.out.println("Match Found");
        }

        RegexExample regexExample = new RegexExample();
        StringManipulation.padLeftSpaces("left", 10);
        StringManipulation.padLeftZeros("left", 10);

        StringManipulation.StringManipulation("Shiva");

        Heriditary heriditary = new Heriditary();
        String data=heriditary.printCharacteristics("Modini", "Sr. Software Engg", "Modini", "5.4", 60);
        System.out.println(data);

        Heriditary father = new FatherGeneration(); // Dynamic Polymorphism
        String dataFather=father.printCharacteristics("Modini", "Sr. Software Engg", "Modini", "5.4", 60);
        System.out.println(dataFather); //Runtime Polymorphism
    }


}