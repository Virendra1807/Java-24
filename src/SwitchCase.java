
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
//    Random rd = new Random();
    Random.Ran();
    }
}

class Random extends SwitchCase{
    public static void Ran(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Total Marks : ");
    int ttlMarks = sc.nextInt();

    switch(ttlMarks) {
        case 90:
            System.out.println("A+ Grade");
            break;
        case 80:
            System.out.println("B+ Grade");
            break;
        case 70:
            System.out.println("C+ Grade");
            break;
        case 60:
            System.out.println("D+ Grade");
            break;
        case 50:
            System.out.println("E");
            break;

        default:
            System.out.println("Fail");
    }
    }
}