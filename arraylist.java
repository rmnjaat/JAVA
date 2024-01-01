import java.util.*;

public class arraylist {

    public static void main(String[] args) {
      
        

        ArrayList<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);


        System.out.println(list);
        
        
        // System.out.println(list.get(2));
        
        
        // list.remove(2);
        
        // list.set(2, 10);
        // System.out.println(list);

        // System.out.println(list.contains(10)); 


        // System.out.println(list.size());

        // Collections.sort(list);
        // Collections.sort(list,Collections.reverseOrder());


        // System.out.println(list);



        //-----------nested arraylist


        ArrayList<ArrayList<Integer>> main = new ArrayList<>();


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(9);

        main.add(list2);
        main.add(list);

        System.out.println(main);

    }
}