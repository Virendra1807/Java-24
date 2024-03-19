import java.util.Scanner;

public class ReplaceCharacterExceptFirstOccerence {
    public static void main(String[] args) {
        // Replace first character occurence in string by $ except first character
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String finalStr = change_char(str);
        System.out.println(finalStr);
    }

    public static String change_char(String s) {
        // complete the function template
        String res = "";

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(0)){
                if(i==0){
                    res += s.charAt(i);
                    continue;
                }
                res += '$';
            }else{
                res += s.charAt(i);
            }
        }

        return res;
    }
}
