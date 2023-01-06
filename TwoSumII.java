// in leetcode the array index starts from 1 not from 0
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int indice[] = new int[2];//to store index of the result
        if(numbers == null || numbers.length < 2) return indice;//auta element matra cha or null cha bhane
        int low = 0;//points to the first element of the array
        int high = numbers.length-1;//points to the last element of the array
        while(low<high){
            int sum = numbers[low]  + numbers[high];//add a[0] and a[high]
            if(sum == target){
                indice[0] =  low + 1;//storing to the indice array! adding 1 cause index starts from 1
                indice[1] =  high + 1;
                break;
            }else if(sum > target){
                high --;//sorted array ko ponter lai ghataune
            }
            else{
                low++;
            }
        }
        return indice;
    }
}