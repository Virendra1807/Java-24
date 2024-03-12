import java.util.Scanner;

public class SumOfPositiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do{
            System.out.println("Enter a Number : ");
            num = sc.nextInt();
            sum += num;
        }while(num>=0);

        System.out.println("Sum of Positive numbers : "+ sum);
    }
}
