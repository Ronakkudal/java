import java.util.*;
public class linear {
    public static int linearSearch(int numbers [],int key){
        for(int i = 0;i<numbers.length; i++){
            if(numbers[i]==key){
                return i;

            }
        }
        return -1;
    }
    public static void main (String args []){
        int numbers[]={2,4,6,8,12,34,5,55,67};
        System.out.println("Enter a key which you find55");
        Scanner sc=new Scanner(System.in);
        int key = sc.nextInt();
        
        int index = linearSearch(numbers,key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("key is at index :" + index);
        }
    }
}
