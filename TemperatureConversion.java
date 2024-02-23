import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in F : ");
        float far = sc.nextFloat();

        float cel = (far - 32) * 5/9;
        System.out.printf("/n Temperature in Celsius : %.2f", cel);
    }
}
