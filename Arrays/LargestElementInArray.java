package Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,67,-9,44,-15,88};
        int max = Integer.MIN_VALUE;
        //or u can use this int max = Interger.MIN_VALUE;
        for(int i =0;i< arr.length;i++){
            if(arr[i]> max) max=arr[i];
        }
        System.out.println(max);
    }
}
