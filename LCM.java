import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = (int) (Math.max(a, b));

        while (true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println("LCM of "+a+" and "+b+" is : "+ lcm);
                break;
            }
            lcm++;
        }
    }
}
