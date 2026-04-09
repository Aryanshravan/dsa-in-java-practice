package Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[]  arr ={5,8,2,6,9};
         for(int ele : arr){//this is another way of traversing an array
             //in this we first write the data type give any name but normaly ele is used for each element of the array : is read as  IN array
             //changes cannot be made in for each loop it is just a copy of the original

             System.out.print(ele+" ");
         }
         for(int ele :arr){
             ele *= 2;
         }
         for(int ele : arr ){
             System.out.println(ele+" ");
             //when u print and see the same array elements are observed they r not multipiled by 2
             Character[] ans ={};
         }
    }
}
