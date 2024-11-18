class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        // Iterate through each customer
        for (int[] customer : accounts) {
            int wealth = 0;
            
            // Calculate the total wealth of the current customer
            for (int bank : customer) {
                wealth += bank;
            }
            
            // Update the maximum wealth found so far
            maxWealth = Math.max(maxWealth, wealth);
        }
        
        return maxWealth;
    }
}
