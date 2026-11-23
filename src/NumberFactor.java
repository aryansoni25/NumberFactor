public class NumberFactor {
    public int wayToGet(int n){
        if(n==0 || n==1 ||n==2)
            return 1;
        if(n==3)
            return 2;
        return wayToGet(n-1)+wayToGet(n-3)+wayToGet(n-4);
    }
}
