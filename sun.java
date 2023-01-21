public class sun {
    public static int calSum(int n ){
        if(n==1){
           return 1;
        }
        int Snm1 = calSum(n-1);
        int Sn = n+Snm1;
        return Sn;

    }
    public static void main (String args[]){
        int n = 5;
        System.out.print("sum of natural number " + n  +":"+ calSum(n));
System.out.println();    }
    
}
