package Arrays;

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args) {
        //print only negative values inside an array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0) System.out.print(arr[i]+ " ");
        }

    }
}
