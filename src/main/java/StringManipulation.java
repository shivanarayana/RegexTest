public class StringManipulation {

    public static boolean StringManipulation(String str){
        //String Constant pool
        System.out.println(str);
        String str2 = "Shiva";
        System.out.println(str2);
        if(str2==(str)) {
            System.out.println("Its Equal");
        }
        String str3 = new String("Shiva");
        String str4 = str3;

        System.out.println("Before Manipulation");
        str = "Manipulated";
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

        if(str2.equals(str3)) {
            System.out.println("Its Equal");
        }

        if(str4.equals(str3)) {
            System.out.println("3&4 - Its Equal");
        }

        if(str4==(str3)) {
            System.out.println("3&4 - Its Same");
        }

        str3 = "changed";

        System.out.println(str4);
        System.out.println(str3);

        System.out.println("final test");

        String stri1 = "Shiva";
        String stri2 = "Shiva";

        if(stri1==(stri2)) {
            System.out.println("1&2 - Its Same");
        }

        if(stri1.equals(stri2)) {
            System.out.println("1&2 - Its equal");
        }

        return true;

    }
}
