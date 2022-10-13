public class Heriditary {
    String FirstName;
    String occupation;
    String LastName;
    String height;
    int weight;

    public String printCharacteristics(String FirstName,
                                       String occupation,
                                       String LastName,
                                       String height,
                                       int weight) {
        return "Heriditary{" +
                "FirstName='" + FirstName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", LastName='" + LastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

class FatherGeneration extends Heriditary{
    String FirstName;
    String occupation;
    String LastName;
    String height;
    int weight;

    public String printCharacteristics(String FirstName,
                                       String occupation,
                                       String LastName,
                                       String height,
                                       int weight) {
        return "FatherGeneration{" +
                "FirstName='" + FirstName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", LastName='" + LastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
