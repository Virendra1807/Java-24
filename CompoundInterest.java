import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        float P = sc.nextFloat();
        System.out.print("Enter Rate of Interest : ");
        float R = sc.nextFloat();
        System.out.print("Enter Time period : ");
        float T = sc.nextFloat();

        double compInt = P*(Math.pow((1+R/100), T));

        System.out.println("/n Compound Interest is : " + compInt);
    }
}
