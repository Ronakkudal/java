public class sybset {
    public static void findSubsets(String str, String ans, int i){
        if(i==str.length()){
            System.out.println(ans);
            return;

        }
        findSubsets(str,ans+str.charAt(i))
    }
    
}
