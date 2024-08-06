// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;

        // Calculate the total sum of all card points
        for (int point : cardPoints) {
            totalSum += point;
        }

        // Special case where k is equal to the length of the array
        if (k == n) {
            return totalSum;
        }

        // Calculate the sum of the first window of size n - k
        int minWindowSum = 0;
        for (int i = 0; i < n - k; i++) {
            minWindowSum += cardPoints[i];
        }

        // Use sliding window to find the minimum sum of n - k length window
        int currentWindowSum = minWindowSum;
        for (int i = n - k; i < n; i++) {
            currentWindowSum += cardPoints[i];
            currentWindowSum -= cardPoints[i - (n - k)];
            minWindowSum = Math.min(minWindowSum, currentWindowSum);
        }

        // The maximum score is totalSum - minWindowSum
        return totalSum - minWindowSum;
    }
}