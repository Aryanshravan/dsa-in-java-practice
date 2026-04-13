package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //prinmting all elements of array
       /* int [] arr = {5,6,7,-8,20};
            //to print length of array
            System.out.println(arr.length);
        for(int i =0;i<=4;i++){// here we go upto the max index and run the loop
            //or we can go upto the length ogf the array that is 5 ie i<5
            System.out.print(arr[i] + " ");
        }
      //  int i = 0;
        //while(i<=4){ u can print using whwile loop also
          //  System.out.print(arr[i]+" ");
        //}*/

        //creating an array and taking input
        int[] karan = new int[7];
            System.out.print("Enter the elements of the array");
        for(int i =0;i<7;i++){
            karan[i] =  sc.nextInt();
        }
        for(int i=0;i<7;i++){
            System.out.print(karan[i]+ " ");
        }
    }
}
