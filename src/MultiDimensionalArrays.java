import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        twoDimensionalArray obj = new twoDimensionalArray();

        obj.array();
        }
    }


class twoDimensionalArray{
     public void array(){
        int arr [][] = new int [3][4];

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter elements of Two dimensional Array : ");
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println("");
        }

        System.out.println("Array elements are : ");
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}