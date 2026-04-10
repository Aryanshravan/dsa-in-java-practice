package Arrays;

public class MinOfArray {
    public static void main(String[] args) {
        int[] arr = {-6,4,66,11,-9};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]< min) min=arr[i];
        }
        System.out.println(min);
    }
}
