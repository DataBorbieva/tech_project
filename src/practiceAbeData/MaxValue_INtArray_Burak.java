package practiceAbeData;

public class MaxValue_INtArray_Burak {
    public static void main(String[] args) {

    int[] arr = {2,5,7,9,10};
    int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max); //10
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] != max && arr[i] > secondMax) secondMax = arr[i]; //9
        }
        System.out.println(secondMax);
    }}
