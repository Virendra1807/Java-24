public class SumOfRowsCols {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int [][] A = {
                {1,6,3},
                {1,2,9}
        };
        int [] arr;
        arr = obj.solve(A);
        // first two values are sum of rows and remaining 3 are sum of cols
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

}


class Solution {
    public int[] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        int size = rows + cols;
        int[] res = new int[size];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i] += A[i][j];
            }
        }

        for (int i = 0; i < cols; i++) {
            int colSum = 0;
            for (int j = 0; j < rows; j++) {
                colSum += A[j][i];
            }
            res[rows + i] = colSum;
        }

        return res;
    }
}