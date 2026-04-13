package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[  ] x  = {10,20,30,45};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
//whenever arry is passed to methods then the array is passed by reference
    public static void change(int[] x) {//u can use int[] y here y is reference
        x[2] = 99;

    }
}
