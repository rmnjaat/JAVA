public class Recursion {



    //check sorted or not
    public static boolean check(int arr[],int n,int i){
        if(i==n-1){
           return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return check(arr, n, i+1);       
    }


    public static void main(String[] args) {
        
        int arr[]={1,2,3,5,4};


      System.out.println(  check(arr,arr.length, 0));


    }
}