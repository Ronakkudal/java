import java.util.ArrayList;


public class rev {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(12);

        list.add(3);

        list.add(4);
        list.add(85);
        list.add(65);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++);
             

                max=Math.max(max,list.get(i));

             }
             System.out.println("max element ="+ max);




    }
    
}
