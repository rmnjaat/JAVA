import java.util.*;

public class Largest_SubarraySum_0 {

    public static void main(String[] args) {

        // int arr[]={15,2,-2,-8,1,7,10,23};

        // HashMap<Integer,Integer> hm = new HashMap<>();

        // int l=0;
        // int sum=0;

        // for(int i=0;i<arr.length;i++){

        // sum+=arr[i];

        // if(hm.containsKey(sum)){

        // l=Math.max(l,i - hm.get(sum));
        // }
        // else{
        // hm.put(sum, i);
        // }

        // }

        // System.out.println(l);




        //Number of subarrays sum = k---------------------------

        // int arr[] = { 1,5,1,2,4,6,1};
        
        int arr[]={10,2,-2,-20,10};
        HashMap<Integer, Integer> hm = new HashMap<>();

        int l = 0;
        int sum = 0;
        int k =-10;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (hm.containsKey(sum-k)) {

                l=l+1;

                hm.put(sum, i);

            } else {
                if(sum==k){
                    l++;
                }
                hm.put(sum, i);
            }

        }

        System.out.println(l);

    }

}