public class FactorialRecursion {
    public static void main(String[] args) {
        FactorialRecursion obj = new FactorialRecursion();
        int result = obj.fact(5);
        System.out.println(result);
    }

    public int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
