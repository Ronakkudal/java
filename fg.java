public class fg {
  
    public boolean containsDuplicate(int [] nums){
        for(int i = 0;int<nums.length;j++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
       
        }

    
    public static void main(String args[]){
        
    int nums=[1,2,3,1];
    printContainsDuplicate();
    
}
