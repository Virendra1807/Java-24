import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible For Licence");
        }
        else {
            System.out.println("Not Eligible");
        }
    }
}
