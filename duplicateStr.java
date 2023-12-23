

public class duplicateStr {


    public static int friendpair(int n){

        if(n==1||n== 2){
            return n;
        }

        return friendpair(n-1)+(n-1)*friendpair(n-2);
    }




    public static void str(String str,int idx,StringBuilder newstr,boolean mape[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        //kaam
        char cchar=str.charAt(idx);
        if( mape[cchar-'a'] == true){
            str(str, idx+1, newstr, mape);
            
        }
        else{
            
            mape[cchar-'a']=true;
            str(str, idx+1 , newstr.append(cchar), mape);

        }

    };

    public static void main(String[] args) {    
        String str="aaegfddfvdfrf";
        str(str, 0,new StringBuilder(""),new boolean[26]);  
        
        System.out.println(friendpair(4));
    }
}