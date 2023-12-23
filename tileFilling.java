public class tileFilling {

    public static int tilefill(int n){


        //base case

        if(n==0 || n==1){
            return 1;
        }


        //2*n floor size
        //kaam 
        //vertical tile


        int verticalTiles=tilefill(n-1);

        ///horizontal
        int horizontalTiles=tilefill(n-2);

        return verticalTiles+horizontalTiles; 

    } ;

    public static void main(String[] args) {
        
        System.out.println(5);
    }
}

