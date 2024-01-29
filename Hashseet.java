import java.util.*;
public class Hashseet {

    public static void UnionInt(int arr1[], int arr2[]){

        LinkedHashSet<Integer> ts = new LinkedHashSet<>();

        for(int i=0;i<arr1.length;i++){
            ts.add(arr1[i]);

        }

        LinkedHashSet<Integer> a= new LinkedHashSet<>();
        
        for(int i=0;i<arr2.length;i++){
            if(ts.contains(arr2[i])){
                a.add(arr2[i]);
            }
            ts.add(arr2[i]);
        }


        System.out.print("Union   :  ");

        for(Integer i: ts){
            System.out.print(i+" ");
        }
        
        System.out.print(" \nIntersection   :  ");

        for(Integer i: a){
            System.out.print(i+" ");
        }

        System.out.println();


    }

    public static void main(String[] args) {
        
        // HashSet<Integer> hs = new HashSet<>();
        // LinkedHashSet<Integer> lhs = new LinkedHashSet<>();  //orsder as inserted

        // TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());


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
        

        // ts.add(1);
        
        // ts.add(2);
        // ts.add(3);
        // ts.add(4);

        // for (Integer i : ts) {
        //     System.out.println(i);
        // }



        int arr[] = {7,3,9};
        int arr2[]={6,3,9,2,9,4};

        UnionInt(arr,arr2);


    }
}