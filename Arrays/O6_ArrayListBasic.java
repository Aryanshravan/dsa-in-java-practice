package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class O6_ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //syntax ArrayList<"Nameof datatype">  name of array = new ArrayList<>();
        arr.add(23);
        arr.add(16);
        arr.add(69);
        arr.add(18);
        arr.add(20);
        System.out.println(arr.get(3));
        //this is how we add elements in the arraylist
        System.out.println(arr.get(2)); // in normal array we do arr[2]
        //this is how we print each index of the array
        //syntax arr.get(index of the element u want to print)
        arr.set(3,67);//this is how we change the elements in array list
        //syntax arr.set(index of the element u want to change, the number u want to change it to
        System.out.println(arr);//used to print the arraylis
        for(int i =0;i<arr.size();i++){
            System.out.println(arr.get(i)+" ");
        }
        for(int ele : arr){
            System.out.println(ele+" ");
        }//these are ways in which u can print ur array list
        arr.add(1,45);
        //this is basically add an element to the array at the desired index
        Collections.reverse(arr);
        System.out.println(arr);
        //used to reverse the arraylist
        int i =0, j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
    }
}
