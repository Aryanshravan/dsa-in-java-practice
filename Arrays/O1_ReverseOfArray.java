package Arrays;

public class O1_ReverseOfArray {
    public static void main(String[] args) {
        int[] arr = {3,29,56,9,18,84,14};
        int n = arr.length;
        int i =0 , j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }//this is called 2 pointer technique
    }
}
