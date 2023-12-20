import java.util.Scanner;

public class str {

    public static void main(String[] args) {

        // char arr[] = { 'a', 'b', 'c', 'd' };

        // String str = "abcd";
        // String str2 = new String("abcd");

        // // Strings are IMMUTABLE
        // Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();

        // System.out.println(name);

        // System.out.println(name.length());

        // String lastname=sc.nextLine();

        // String fullname=name+" "+lastname;
        // System.out.println(fullname);

        // System.out.println(name.charAt(4));


        // String s1="raman";
        // String s2="raman";
        // String s3=new String("raman");

        // // if(s1==s3){
        // if(s1.equals(s3)){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Not Equal");

        // }

        //str.substring(0,4);

        //str1.compareTo(str2);

        //str1.comparetoIgnoreCase(str2);


        // StringBuilder sb= new StringBuilder("rmn");

        //     sb.append("jangu");

        // // sb.toString();

        // System.err.println(sb);


        //String compression



        String str="aaabbcccdd";

        StringBuilder newstr=new StringBuilder("");

        
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ) {
                count++;
                i++;
            }

            newstr.append(str.charAt(i));

            if(count>1){
                newstr.append(count.toString());
            }
            
        }

        System.out.println(newstr);

       


    } 
}