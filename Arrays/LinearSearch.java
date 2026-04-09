package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,6,4,88,99,69};
        int x = 69;
        boolean target = false;// ,eams target array mai nhi hai
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.print("Target found at index " + i);
                target = true;// means target array mai hai
                break;
            }
        }
        System.out.println();
        if(target == true) System.out.println("Target exisits in Array");
        else System.out.println("Target not present in array ");

    }
}
