package Arrays;
import java.util.Arrays;
public class O4_Segregate0and1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        int n = arr.length;
        int i = 0;
        int j = n - 1;// we start with i and j is n-1 cause index start fom zero so j starts form last index
             while(i<j) {
                 if (arr[i] == 0) i++;  //if in the ith index the value is 0 we move forwoard
                 else if (arr[j] == 1) j--; //if jth index is 1 we move 1 step back backward
                 else if (arr[i] == 1 && arr[j] == 0) {
                     //if at ith index the value is 1 and at j its 0 then we swap and then move i forword and j backword
                     arr[i] = 0;
                     arr[j] = 1;
                     i++;
                     j--;
                     //this way all 0 are in the left and 1 are in the right
                 }
             }
        // here printing is not heepning logic is correct
        System.out.println(Arrays.toString(arr));
        }

    }






