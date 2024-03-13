import java.util.Scanner;

public class ArrayEvenOddSumDiff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 elements to array : ");
        int [] arr = new int[10];
        for (int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int res = even_odd(arr);
        System.out.println("Difference is : "+ res);

   }

    public static int even_odd(int[] A) {
        // Write your code here
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]%2==0){
                evenSum += A[i];
            }else{
                oddSum += A[i];
            }
        }

        int diff;
        if(evenSum >= oddSum){
            diff = evenSum - oddSum;
        }else{
            diff = oddSum - evenSum;
        }

        return diff;
    }

}
