public class  numberreverse{
    public static void main(String[] args){

        int a=10189;

        int rev=0;

        while(a>0){

            int rem=a%10;

            rev = rev*10+rem;

            a/=10;

        }

        System.out.println(rev);
    }
}