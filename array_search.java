public class array_search{
    
//Integer.MIN_VALUE   -infinity


    public static boolean bs(int a[],int key){

        // for(int i=0;i<a.length;i++){
        //     if(a[i]==key) return true;
        // }
        // return false;


        int l=0;
        int h=a.length-1;
            
        
        while(l<=h){
            int mid= (l+h)/2;
            if(a[mid]==key){
                return true;
            }
            else if(a[mid]>key){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }


        return false;
    }

    public static void main(String[] args){
        
        int a[]={-2,-3,4,-1,-2,1,5,-3};

        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            cs+=a[i];

            if(cs<0){
                cs=0;
            }

            ms=Math.max(ms, cs);
        }

        System.out.println(ms);


    }
}