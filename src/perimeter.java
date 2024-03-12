import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        System.out.println("Enter 4 sides for perimeter : ");
        Scanner sc =  new Scanner(System.in);
        float a = sc.nextFloat();
        float a2 = sc.nextFloat();
        float a3 = sc.nextFloat();
        float a4 = sc.nextFloat();

        System.out.println("Perimeter is : "+ (a+a2+a3+a4) + "cm");
    }
}
