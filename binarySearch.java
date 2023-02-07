// adding this comment
public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //binary search only works on sorted data
        int low = 0; //pointing to the first element 
        int high= arr.length-1;
        int target = 4;
        int i =0;
        while(low <= high){
            int middle = (low+high)/2;
            if(arr[middle]==target){
                System.out.println(middle);
            }
            if(target > arr[middle]){
                low = middle + 1;   
            }
            else{
                high = middle - 1 ;
            }
            i++;
        }
        System.out.println(i);
    }
}
