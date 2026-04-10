package Arrays;

class O2_RotateArray{
    static void rotate(int arr[], int d ){
        //so basically in this question we have to rotate the elements of the array
        //we have to take the elements one by one and aadd them add the end of the array untill we reach the value of d
        //if d=6 and array has 1234 then 2341 next 3412 next 4123 next 1234 next 2341 next 3412
        // since this is same as d = 2 we do d =d %nM
        int n = arr.length;
        d %= n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int[] arr, int i , int j ){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}