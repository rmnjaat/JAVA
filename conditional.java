import java.util.*;
public class conditional{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();

        if(age<15){
            System.out.println("Child");

        }
        else if(age<50){
            System.out.println("Young");
        }
        else{
            System.out.println("Old");
        }

        sc.close();


        //ternery operator
        
        int a=3;

        String s=(a%2==0)?"even":"odd";
        System.out.println(s);
    

        //switch case

        int cs =2;

        switch(cs){
            case 1: System.out.println("one");
                    System.out.println("oneeee");  
                    break;  
            
             case 2: {
                System.out.println("two");
                System.out.println("twooo");  
                break;  
             }
            default:
                System.out.println("default");


        }
    
    }
}