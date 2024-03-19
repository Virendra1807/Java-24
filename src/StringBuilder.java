class StrBuilder {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("abc");
        /* As we know that the String are immutable in nature
        but If we want to modify String then We use String Builder */
        System.out.println(s1);
        s1.append(" World");
        System.out.println(s1);
        s1.replace(0, 3, "Hello");
        System.out.println(s1);
        s1.insert(5, '_');
        System.out.println(s1);
        s1.delete(6, 7);
        System.out.println(s1);

        // Convert String Builder to String

        String str = s1.toString();
        System.out.println("String Builder is converted into String : "+ str);



    }
}
