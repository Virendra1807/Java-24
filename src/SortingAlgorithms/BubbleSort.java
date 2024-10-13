package SortingAlgorithms;



public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {10,5,1,9,6,5,2};

        for (int pass = 1; pass < arr.length; pass++ ){
            for (int i = 0; i<arr.length-pass; i++){
                if(arr[i] > arr[i+1]){
                    int ele = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = ele;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

}

