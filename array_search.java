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
        
        int a[]={1,2,3,5,6,7,8};

        System.out.println(bs(a,3));


    }
}