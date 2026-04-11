package Arrays;
import java.util.Arrays;
public class O4_SecondMethos {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,1,0};
        int n = arr.length;
        int zeros =0; // here we count the number of zeros in array
        int ones = 0; // here the numbers of ones are counted
        for(int ele : arr){
            if(ele==0) zeros++;
            else ones++;

        }
        int index = 0; // this is used for the positioning of 0's and 1's
        for(int i = 0;i<zeros;i++){
            arr[index++] = 0;
        }
        for(int j =0;j<ones;j++){
            arr[index++] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
