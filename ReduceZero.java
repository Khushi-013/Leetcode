class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        // Continue the loop as long as num is greater than 0
        while (num > 0) {
            // If the number is even, divide it by 2
            if (num % 2 == 0) {
                num /= 2;
            } else {
                // If the number is odd, subtract 1
                num -= 1;
            }
            // Increment the step count
            steps++;
        }
        return steps;
    }
}
