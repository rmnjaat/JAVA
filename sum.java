import java.util.*;

public class sum{
    public static void main(String[] args){
        // making obj of  Scanner class to parsing  input
        // system.in specifIng which type of input have to read i.e keyboard or also can file

        Scanner sc =  new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a+b);



        //refer 2nd page to notes
        byte d=5;
        d=(byte)(d*2);
        System.out.println(d);

        
        // to avoid resource leak
        sc.close();
    }
}