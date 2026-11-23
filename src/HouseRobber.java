public class HouseRobber {
    private int rob(int[] num,int curr){
        if(curr>= num.length){
            return 0;
        }else{
            int steal=num[curr]+rob(num,curr+2);
            int skip=rob(num,curr+1);
            return Math.max(steal,skip);
        }
    }
    public int rob(int[] num){
        return rob(num,0);
    }
}
