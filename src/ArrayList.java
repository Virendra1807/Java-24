import java.sql.SQLOutput;
import java.util.*;

class ArrayListEx {
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(100);
        arr.add(20);
        arr.add(50);
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        arr.remove(1);

        System.out.println(arr);


    }
}
