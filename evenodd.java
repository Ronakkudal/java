import java.util.*;
public class evenodd {
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n& bitMask)==0){
            System.out.println("even number");


        }
        else{
            System.out.println("odd Number");
        }
    }
    public static void main(String args[]){
        oddOrEven(2);
        oddOrEven(3);
        oddOrEven(5); oddOrEven(81);


    }
    
}
