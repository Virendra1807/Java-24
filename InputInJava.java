import java.io.BufferedReader;
import java.io.DataInputStream; // IOException
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; // InputMismatchException exception

public class InputInJava {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter Your Age :");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

//        DataInputStream dis = new DataInputStream(System.in);
//        String s = dis.readLine();
//        int age = Integer.parseInt(s);

//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        String s2 = br.readLine();
//        int age = Integer.parseInt(s2);

        System.out.println(age);
    }
}
