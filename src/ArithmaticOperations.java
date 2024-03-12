import java.util.Scanner;

public class ArithmaticOperations {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        float a = sc.nextFloat();
        System.out.print("\nEnter 2nd Number : ");
        float b =  sc.nextFloat();

        float d = a+b;
        System.out.println("\nAddition is : "+ d);
        float c = a-b;
        System.out.println("Subtraction is : "+ c);
        System.out.println("Multiplication is : " + a*b);
        System.out.println("Division is : "+ a/b);
        System.out.println("Modulus is : "+ a%b);

    }
}
