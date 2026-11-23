public class Convert {
    private int findMin(String s1,String s2,int index1,int index2){
        if(index1==s1.length()){
            return s2.length()-index2;
        } if(index2==s2.length()){
            return s1.length()-index1;
        }if(s2.charAt(index2)==s1.charAt(index1)){
            return findMin(s1,s2,index1+1,index2+1);
        }
        int deleteOP=1+findMin(s1,s2,index1,index2+1);
        int insertOP=1+findMin(s1,s2,index1+1,index2);
        int replaceOP=1+findMin(s1,s2,index1+1,index2+1);
        return Math.min(deleteOP,Math.min(insertOP,replaceOP));
    }
    public int findMin(String s1,String s2){
        return findMin(s1,s2,0,0);
    }
}
