package Arrays;

public class O3_MissingArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7};
        int n = arr.length +1;//we take n+1 becasue 1 is missing
        int sum = n*(n+1)/2;// then we find the sum of all the numbers
        int arraySum = 0;
        for( int ele : arr){
            arraySum += ele;//here we find the sum of the elements in the array
        }
        System.out.println(sum-arraySum);//then we substract the total sum by the arraysum
        //after substracting we get the missing number
    }
}
