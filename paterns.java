public class paterns {
    public static void main(String[] args) {

        int a = 4;
        // for(int i=0;i<a;i++){
        // for(int j=0;j<a;j++){
        // if(i==0 || i==a-1 || j==0 || j==a-1){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.err.print("\n");
        // }

        // for(int i=0;i<a;i++){
        // for(int j=0;j<i+1;j++){
        // if((i+j)%2==0){
        // System.out.print("1");
        // }
        // else{
        // System.out.print("0");
        // }
        // }

        // System.out.print("\n");
        // }

        // Butterfly pattern

        // for(int i=0;i<=a;i++){

        // //stars
        // for(int j=0;j<i;j++){
        // System.out.print("*");
        // }

        // for(int k=0;k<(2*(a-i));k++){
        // System.out.print(" ");
        // }

        // for(int l=0;l<i;l++){
        // System.out.print("*");
        // }

        // System.out.print("\n");
        // }

        // for(int i=a;i>=0;i--){

        // //stars
        // for(int j=0;j<i;j++){
        // System.out.print("*");
        // }

        // for(int k=0;k<(2*(a-i));k++){
        // System.out.print(" ");
        // }

        // for(int l=0;l<i;l++){
        // System.out.print("*");
        // }

        // System.out.print("\n");
        // }



        //solid rhombus
    //     for (int k = 0; k < a; k++) {
    //         for (int i = 0; i < a-k ; i++) {
    //             System.out.print(" ");
    //         }
    //         for(int l=0;l<a;l++){
    //             System.out.print("*");
    //         }
    //         System.out.print("\n");
    //     }

      //  hollow rhombus
        // for (int k = 0; k < a; k++) {
        //     for (int i = 0; i < a-k-1 ; i++) {
        //         System.out.print(" ");
        //     }
        //     for(int l=0;l<a;l++){
        //        if(k==0 || k==a-1 ||l==0 ||l==a-1 ){
        //         System.out.print("*");

        //        }
        //        else{
        //             System.out.print(" ");
        //        }
        //     }
        //     System.out.print("\n");
        // }

        for(int i=0;i<a;i++){
            for(int j=0;j<a-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print(i+1+" ");

            }
            System.out.print("\n");
        }




    }
}