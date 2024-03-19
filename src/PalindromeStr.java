import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();

        StringBuilder s1 = new StringBuilder(str);
        s1.reverse();

        String revStr = s1.toString();

        if (str.equals(revStr)){
            System.out.println("Yes it is palindrome String");
        }else {
            System.out.println("No it is not palindrome String");
        }
    }
}
