package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        //syntax of array
         // variable type[] arrayname = {}
        int[] aryan ={1,45,14,18,98};
        System.out.println(aryan);// well only get address
        //indexing
        System.out.println(aryan[3]);// ull get element at 3rd index
        //indexing starts from 0 to n so if there are 5 elements indexing is from 0-4
        //creating and empty array with specific number of indexes
        int[] arr = new int[4];
        arr[0] = 40;
        arr[1] = 50;
        arr[2] = 60;
        arr[3] = 70;


    }
}
