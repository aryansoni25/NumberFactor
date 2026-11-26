public class HouseRobber {
    private int rob(int[] nums,int current){
        if(current>= nums.length){
            return 0;
        }else{
            int steal=nums[current]+rob(nums,current+2);
            int skip=rob(nums,current+1);
            return Math.max(steal,skip);
        }
    }
    public int rob(int[] nums){
        return rob(nums,0);
    }
}
