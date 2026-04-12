package Arrays;

public class O8_MergeShortTwoArrays {
    //int his question 2 arrays are given in sorted order now u have to combine
    //both the arrays in a 3rd array in sorted manner
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9, 20};
        int[] b = {1, 3, 4, 5, 7, 8};
        int[] c = new int[a.length + b.length];//obivo if we are sorting to arrays the size of the 3rd aray will be the sume of both the given arrays note they can be of any size therefoe use this
        for (int ele : c) System.out.print(ele + " ");
        System.out.println();

        merge(c, a, b);//we created a function that merges cause we have to merge again and again
        for (int ele : c) System.out.print(ele + " ");
        System.out.println();
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];//here we basically the first element of 1st array and 2nd array and if the 1st element in the 1st array is smaller than the 1st element in if 2nd array then we add the 1st element of
                                  //1st array to 3rd array
                                 //here the 1st element if the first array is only compared thats why we dont move the j only i and k
            } else {
                c[k++] = b[j++]; //basically the 1st element if the 2nd array is samller than the 1st element of the 1st array
            }
            //there will come a momemnt where any 1 of the array traversing is done
             //here the first array travesing has been done and elements of the 2nd array are left therefore we just print the elements in b as it is
                while (i < a.length) {
                    c[k++] = a[i++];
                }
                //2nd array katam 1st array mai elements bacche hai
                    while (j < b.length) {
                        c[k++] = b[j++];

                    }

                }
            }

        }

