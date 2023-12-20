public class routeString {

    public static void route(String str) {

        int x=0;
        int y=0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='N'){
                x++;
            }
            else if(str.charAt(i)=='S'){
                x--;
            }
            else if(str.charAt(i)=='E'){
                y++;
            }
            else if(str.charAt(i)=='W'){
                y--;
            }
        }

        double ans= Math.sqrt(x*x +y*y);

        System.out.println(ans);
        


        
    }

    public static void main(String[] args) {
        

        String str="WNEENESENNN";

        route(str);

    }
}