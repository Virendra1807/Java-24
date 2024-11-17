package HackerRankProblems;

import java.util.ArrayList;

public class BarChatArray {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(2);

        int maxEle=0;
        for(int i = 0; i < arr.size(); i++){
            if(maxEle < arr.get(i)){
                maxEle = arr.get(i);
            }
        }

        for(int i = maxEle; i > 0; i--){
            String str = "";
            for(int j=0; j < arr.size(); j++){
                if(arr.get(j) >= i){
                    str = str + " git *";
                }
                else {
                    str = str + "  ";
                }
            }

            System.out.println(str);
        }

    }
}
