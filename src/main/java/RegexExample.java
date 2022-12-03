import java.util.Calendar;
import java.util.HashMap;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {

        String exp = "31/10/2022";
        Calendar cal = Calendar.getInstance();
        int day = Integer.parseInt(exp.substring(0,2));
        int month = Integer.parseInt(exp.substring(3,5));
        int year = Integer.parseInt(exp.substring(6,10));
        int calenderYear = cal.get(Calendar.YEAR);
        int calenderMonth = cal.get(Calendar.MONTH) + 1;
        int calenderDay = cal.get(Calendar.DATE);

        if(year > calenderYear)
            System.out.println("Pass");

        if(year == calenderYear)
        {
            if(month > calenderMonth){
                System.out.println("Pass");;
            }
            if(month == calenderMonth){
                if(day > calenderDay){
                    System.out.println("Pass");;
                }
            }
        }


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

        //Dynamic Method Dispatch
        Heriditary heriditary = new Heriditary();
        String data=heriditary.printCharacteristics("Modini", "Sr. Software Engg", "Modini", "5.4", 60);
//        System.out.println(data);

        Heriditary father = new FatherGeneration(); // Dynamic Polymorphism
        String dataFather=father.printCharacteristics("Modini", "Sr. Software Engg", "Modini", "5.4", 60);
//        System.out.println(dataFather); //Runtime Polymorphism

        StringGame stringGame = new StringGame();
        stringGame.StartGame();

        MapHash.printValues();
    }


}