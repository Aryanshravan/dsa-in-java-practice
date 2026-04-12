package Arrays;
import java.util.Arrays;
public class O5_WaveArray {
    public static void main(String[] args) {
        //in this question we have to create a wave like structure like big number and then small number and then big again
        //in order to do this we basically swap the first 2 and then the next 2 and continue untill all elements are done
        int[] arr ={2,6,4,7,3};
        for(int i=0;i< arr.length-1;i+=2){//so over here we will get indexout of bound exception if we go untill end of the array
            //we are basically moving i index every 2 steps and in odd cases ther will be no elemnts left to swap with that why -1
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
