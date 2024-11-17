public class ReverseString {
    public static void main(String[] args) {
        String s1 = "I love programming";

        String revStr = reverseStr(s1);
        System.out.println(revStr);
    }

    public static String reverseStr(String a){
        String finalString = "";
        for(int i = a.length()-1; i >= 0; i--) {
            finalString = finalString + a.charAt(i);
        }


        return finalString;
    }
}
