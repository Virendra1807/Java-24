import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        float P = sc.nextFloat();
        System.out.print("Enter Rate of Interest : ");
        float R = sc.nextFloat();
        System.out.print("Enter Time period : ");
        float T = sc.nextFloat();

        float smpInt = (P * R * T)/100;

        System.out.println("/n Simple Interest is : "+ smpInt);

    }
}
