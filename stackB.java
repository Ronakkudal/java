import java.util.*;
public class stackB {

    public static void pushAtBottom(Stack<Integer> S, int data){
        if(S.isEmpty()){
            S.push(data);
            return;
        }
        int top = S.pop();
        pushAtBottom(S, data);
        S.push(top);
    
    }
    public static void main(String args[]){
      Stack<Integer> S = new Stack<>();
      S.push(1);
      S.push(2);
      S.push(3);

      pushAtBottom(S,4);
      pushAtBottom(S,5);
      pushAtBottom(S,6);
      while(!S.isEmpty()){
        System.out.println(S.pop());
      }
    }
    
}
