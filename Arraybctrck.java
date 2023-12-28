public class Arraybctrck {

    public static void change(int arr[],int i,int val){
        //base
        if(i==arr.length){
            return;
        }


        arr[i]=val;
        change(arr, i+1, val+1);

        arr[i]=arr[i]-2;
         
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        change(arr, 0, 1);



        for(int i=0;i<5;i++){
            System.out.println(arr[i]+" ");
        }
    }
}