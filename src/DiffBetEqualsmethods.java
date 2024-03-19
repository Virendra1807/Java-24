public class DiffBetEqualsmethods {
    public static void main(String[] args) {
        String s1 = "abc"; // This will store in String Pool
        String s2 = "abc"; // This will store in String Pool
        String s3 = new String("abc"); // This will store in Heap Memory

        if (s1 == s2){
            System.out.println("s1 and s2 both refer to same object in String Pool");
        }else{
            System.out.println("s1 and s2 Not equal");
        }

        if (s1 == s3){
            System.out.println("s1 and s3 are Equal");
        }else {
            System.out.println("s1 and s3 are not equal bcoz we are using == to compare String pool Object and Heap Memory Object");
        }

        if (s1.equals(s3)){
            //equals() method compare content not reference like == operator
            System.out.println("s1 and s3 are equal but here we use equals() method");
        }


    }
}
