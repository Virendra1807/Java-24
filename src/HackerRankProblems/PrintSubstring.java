package HackerRankProblems;

import java.util.Scanner;

public class PrintSubstring {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc  = new Scanner(System.in);
        String A = sc.nextLine();
        System.out.println("Enter a Start and End Index for SubString : ");
        int startIndex = sc.nextInt();
        int EndIndex = sc.nextInt();

        String result = ExtraxtSubString(A, startIndex, EndIndex);
        System.out.println("Result is  : "+result);

        sc.close();
    }

    public static String ExtraxtSubString(String B, int start, int end){
        //Using pre-define function substring
        //return A.substring(start, end);
        String res = new String();
        while(start < end){
            res += B.charAt(start);
//              System.out.println(B.charAt(start));
            start++;
        }
        System.out.println(res);
        return res;
    }
}
