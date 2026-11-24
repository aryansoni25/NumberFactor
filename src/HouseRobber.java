public class HouseRobber {
    private int rob(int[] num,int current){
        if(current>= num.length){
            return 0;
        }else{
            int steal=num[current]+rob(num,current+2);
            int skip=rob(num,current+1);
            return Math.max(steal,skip);
        }
    }
    public int rob(int[] num){
        return rob(num,0);
    }
}
