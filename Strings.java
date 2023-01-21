import java.util.*;
public class Strings {
    public static void printLetter(String str){
        for(int i = 0; i<str.length(); i++){
          System.out.print(str.charAt(i) + " ");
          
        }
        System.out.println();
    }
    public static void main(String args[]){
      /*  String str = "abcf" ;
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);


    }*/
    String fullName = "Ronak kudal";
    printLetter(fullName);
}

}
