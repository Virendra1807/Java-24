public class AvgOfArrayEle {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 2};
            int sum = 0;

            for (int i : arr) {
                sum += i;
            }
            System.out.println(sum);
            System.out.println((float) sum / arr.length);
        }
}
