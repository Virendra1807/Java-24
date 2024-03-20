public class VariableArguments {

    public static int getAvg(int ...vararg){
        int ttl = 0;
        System.out.println(vararg.getClass().getSimpleName());
        for(int num : vararg){
            ttl += num;
        }
        return ttl / vararg.length;
    }

    public static void main(String[] args) {
        int avg = getAvg(1,2,3,4,5,6,7,8,9);
        System.out.println(avg);

        int avg2 = getAvg(10,20,30);
        System.out.println(avg2);
    }
}
