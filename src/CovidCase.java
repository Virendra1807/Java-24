import java.util.Scanner;

class CovidCases {
        public static int daysToZeroCases(int A, int B, int C) {
            int netChangePerDay = B - A;
            int daysToZero = C / netChangePerDay;
            if (C % netChangePerDay != 0) {
                daysToZero++;
            }
            return daysToZero;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int A = sc.nextInt(); // Average cases recovered per day
            int B = sc.nextInt(); // New cases of COVID-19 daily
            int C = sc.nextInt(); // Current active cases of COVID-19
            int days = daysToZeroCases(A, B, C);
            if(days < 0){
                days *= -1;
            }
            System.out.println("Days to reach zero cases: " + days);
        }
    }

