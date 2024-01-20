import java.util.*;
public class Hashseet {

    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();  //orsder as inserted

        TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());


        // lhs.add(1);
        
        // lhs.add(2);
        // lhs.add(3);
        // lhs.add(4);
        // System.out.println(hs.contains(2));
        // hs.remove(2);
        // System.out.println(hs.size());
        // System.out.println(hs.isEmpty());

        // Iterator it = hs.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        

        ts.add(1);
        
        ts.add(2);
        ts.add(3);
        ts.add(4);

        for (Integer i : ts) {
            System.out.println(i);
        }



    }
}