package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class O7_AddingOneToArrayList {
    Vector<Integer> addOne(int[] arr) {//vaector nothiing but array list
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;//arr.length not size because its an array inside
        int carry = 1;//here we initilized the carry
        for(int i = n-1;i>=0;i--){//we run the loop reverse basically i starrts from the last index
            if(arr[i]+carry<=9){//now we check if the no in the last index puls the carry 1 is less than 9 or not
                ans.add(arr[i]+carry);//if yes the we add it to the arraylist
                carry = 0;//and the carry for that number will be 0
            }
            else{
                ans.add(0);//if it is not the obviously in the ans wee add 0 then carry one
                //note we are adding only one so the only possible case is 9+1 = 10
                carry =1;
            }
        }
        if(carry==1) ans.add(1);//here let us assume the number is 999 and we add 1 to this no then there will be 1 carry left that is also added to the arraylist

        Collections.reverse(ans);//here we reversed the array list caused we kept adding the numbers from the back and the ith index started from the units place
        //therefore we reverse it to get the correct answer
        return ans;


    }
}



