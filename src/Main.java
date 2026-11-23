public class Main {
    public static void main(String[] args) {
        NumberFactor n=new NumberFactor();
        System.out.println("Number Factor of 5: "+n.wayToGet(5));


        HouseRobber h=new HouseRobber();
        int arr[]={6,7,1,30,8,2,4};
        System.out.println(h.rob(arr));


        String s1="table";
        String s2="tble";
        Convert c=new Convert();
        System.out.println(c.findMin(s1,s2));
    }
}