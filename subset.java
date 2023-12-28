public class subset {


    public static void subsett(String str, String ans,int i){
        //base

        if(i==str.length()){
            System.out.println(ans);
            return;
        }





        //yes
        subsett(str, ans+str.charAt(i), i+1);
        
        //no choice
        
        subsett(str,ans, i+1);
        

    }


    public static void main(String[] arg){
        String str="abc";

        subsett(str,"",0);
        
    }
}