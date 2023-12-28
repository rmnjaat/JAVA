public class mergesort {

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];

        int i=si;

        int j=mid+1;

        int k=0;


        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                
            }
            else{
                 temp[k]=arr[j];
                j++;
            
            }
            k++;
        }

        //bachhe hue element 

        while (i<=mid) {
            temp[k++]=arr[i++];
        }

         while (j<=ei) {
            temp[k++]=arr[j++];
        }



        //copy to original array

        for(k=0,i=si; k < temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void mergsrt(int arr[],int si,int  ei) {
        if(si>ei  || si==ei){
            return; 
        }


        int mid=si+(ei-si)/2;
        

        mergsrt(arr,si,mid);
        mergsrt(arr,mid+1,ei);

        merge(arr,si,mid,ei);
        

    }

    public static void main(String[] args) {

        int arr[]={6,3,9,5,2,8};

        int si=0;
        int ei=arr.length-1;
        
        mergsrt(arr,si,ei);


        for(int i=0;i<=ei;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
}