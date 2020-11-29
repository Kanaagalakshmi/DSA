class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int imax=nums[0];
        if(nums.length==1)return nums[0];
        int currsum=0;
        int flag=0;
        
        for(int i=0;i<nums.length;i++){
            
                currsum=currsum+nums[i];
                currsum=Math.max(nums[i],currsum);
                imax=Math.max(imax,currsum);
                
                
            }
           
        
        return imax;
    }
}