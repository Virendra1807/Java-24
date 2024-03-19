import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        boolean flag = true;

        System.out.print("\nEnter the elements of an Array : ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for (int i=0; i<size; i++){
            if (arr[i]==num){
                System.out.println("Number is found at index : "+i);
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Number not found !");
        }
    }
}
