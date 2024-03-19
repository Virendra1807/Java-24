public class StringAndCharArr {
    public static void main(String[] args) {
        // we prefer to make String bcoz String has many builtin menthods so it is easy to manipulate
        String str = "hello";
        char [] arr = {'h','e','l','l','o'};

        System.out.println(str);
        System.out.println(arr);

        String str2 = new String(arr);
        System.out.println("Char Array is converted into a String : " + str2);

        char [] arr2 = str.toCharArray();
        System.out.print("String is converted into a Char Array : ");
        System.out.println(arr2);


    }
}
