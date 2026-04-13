package Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = {10,2,4,6,7,69};
        int product = 1;
        for(int i =0;i< arr.length;i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
