import java.util.Scanner;

public class CommonEleOfArrays {
    public static void main(String[] args) {
        // Read Two arrays from User and generate a third array containing all the
        // Common elements from the first two
        Scanner sc = new Scanner(System.in);

        int [] arr1 = new int[5];
        int [] arr2 = new int[5];

        System.out.print("Enter Elements of Array 1 : ");
        for (int i=0; i< arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter Elements of Array 2 : ");
        for (int i=0; i< arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[5];
        int i,j;
        int k = -1;
        for (i=0; i<arr1.length; i++ ){
            for (j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    k++;
                    arr3[k] = arr1[i];
                }
            }
        }

        System.out.print("Elements of Array 3 : ");
        for(int a=0; a<arr3.length; a++){
            System.out.print(" " + arr3[a]);
        }
    }
}
