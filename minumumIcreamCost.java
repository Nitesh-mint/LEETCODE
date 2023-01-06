class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n=costs.length;
        int res=0;
        while(res < n && costs[res]<=coins){
            // We can buy this icecream, reduce the cost from the coins. 
            coins -= costs[res];
            res += 1;
        }
        return res;
        
    }
}