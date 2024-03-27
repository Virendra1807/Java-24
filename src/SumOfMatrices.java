import java.util.Scanner;

public class SumOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows of array : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr4;
        arr4 = SumOfTwoDimensionalArray.array(rows, cols);
        System.out.println("Sum of matrices : ");
        for(int i = 0; i < arr4.length; i++){
            for (int j = 0; j < arr4[i].length; j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


class SumOfTwoDimensionalArray{
//    public static [][]

    static int[][] array(int rows, int cols){
        int arr [][] = new int[rows][cols];
        int arr2[][] = new int[rows][cols];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of 1st Array : ");
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of 2nd Array : ");
        for(int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // performing Summation of matrices
        int [][]arr3 = new int[3][4];
        for(int i = 0; i < arr3.length; i++){
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        sc.close();
        return arr3;
    }

}