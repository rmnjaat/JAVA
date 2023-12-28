public class Permutation {

    public static void per(String str,String ans)
    {

        //base

        if(str.length()==0){
            System.out.println(ans);
            return;
        }


        //recursion

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String Newstr=str.substring(0, i) +str.substring(i);
            per(Newstr, ans+curr);

        }

    }

    public static void main(String[] args) {


        String str="abc";
        per(str, "");
        
    }

}