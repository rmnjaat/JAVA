import java.util.*;
public class functions{

    public static int Sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
    
        // int sum=Sum(a,b);

        // System.out.println("Sum is : "+sum);

        // System.out.println(fact(a));

        int n=5;
        int r=2;
        System.out.println(bicof(5,2));

    }

    public static int fact(int n ){

        if(n==1){
            return 1;
        }

        else{
            return n*fact(n-1);
        }

    }


    public static int bicof(int n,int r){

        return (fact(n)/(fact(r)*fact(n-r)));

    }
}