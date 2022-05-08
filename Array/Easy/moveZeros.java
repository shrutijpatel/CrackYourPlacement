class Solution {
    public void moveZeroes(int[] nums) {
        int ballSize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                ballSize++; 
            }
            else if (ballSize > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-ballSize]=t;
            }
        }
    }
}
