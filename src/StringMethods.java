import java.sql.SQLOutput;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello World";
        int a = 20;

        System.out.println(s1.charAt(4));
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.contains("Wor"));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2, 7));
        System.out.println(s1.indent(10));
        System.out.println(s1.indexOf('r'));
        System.out.println(s1.lastIndexOf('l'));
    }
}
