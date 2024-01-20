import java.util.*;
public class hashmapQuestions {

    public static void Freq(int arr[]){

        HashMap<Integer,Integer> hm = new HashMap<>();

        int n = arr.length/3;

        for(int i=0;i<arr.length;i++){
          
            // if(hm.containsKey(arr[i])){
            //     hm.put(arr[i],hm.get(arr[i])+1);
            // }
            // else{
            //     hm.put(arr[i],1);
            // }

            //Alternate of above is getOrDefault

            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        // Set<Integer> s = hm.keySet();

        for (Integer i : hm.keySet()) {
            if(hm.get(i) > n){
                System.out.println(i);
            }
        }
        
    }

    public static boolean isAnagranm(String s,String t){

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))){
                if(hm.get(t.charAt(i))>1){
                hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
                }
                else{
                    hm.remove(t.charAt(i));
                }

            }
            else{
                return false;
            }

        }
        
        if(hm.isEmpty()){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        // int arr[]={1,3,2,5,1,3,1,5,1};
        int arr[]={1,2};

        // Freq(arr);



        String s="earth";
        String t ="heart";

        System.out.println(isAnagranm(s, t));

    }
}