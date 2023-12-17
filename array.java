public class array{

    // array passed in function by refrence
    public static void main(String[] args){
        // way of array decleration
        
        
        // int array[]=new int[5];
        // int num[]={1,2,3};
        // String names[]={"Raman","Kartik"};

        int a[]={1,2};

        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }

        for(int i:a) System.out.println(i);

        //cannot assign like this give out of bound 
        // a[3]=3;
        //System.out.println(a[3]);
        
    }
}