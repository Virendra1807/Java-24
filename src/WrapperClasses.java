//class WrapperClasses {
//}

class Practice {
    public static void main(String[] args) {
        Integer x = 10;
        Integer y = 10;

        if (x == y) System.out.println("Equal");
        else System.out.println("Not equal");

        //Unboxing
        int a = x;

        Float x2 = 5.2f;
        float y2 = 4.3f;

        //Autoboxing
        Float b = y2;

        System.out.println(x2 + y2);

        Integer x3 = 5;
        Character y3 = 'x';
        Double z3 = 2.1;

        System.out.println(x3 + y3 + z3);
    }
}
