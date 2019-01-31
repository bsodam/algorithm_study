class Solution {
    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int total = 0;
        int leftSum = 0;
        int rightSum = 0;
        
        for(int a A){
            total += a;
        }
        
        for(int i=1; iA.length; i++) {
            leftSum += A[i-1];
            rightSum = total - leftSum;
            min = Math.min(min, Math.abs(leftSum-rightSum));
        }
        
        return min;
    }
}