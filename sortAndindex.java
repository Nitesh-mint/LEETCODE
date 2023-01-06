public class sortAndindex {
    public static int main(String[] args) {
        int arr[] = {1,3,5,6,7};
        int first = 0;
        int target = 5;
        int last = arr.length - 1;
        while(first<=last){
            int middle = first + (last - first)/2;
            if(arr[middle]==target){
                return middle;
            }
            else if(arr[middle]>target){
                last = middle - 1;
            } 
            else{
                first = middle + 1;     
            }
        }
        return first;
    }
}
