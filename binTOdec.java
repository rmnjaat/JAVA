public class binTOdec{

    public static int dtb(int n){

        int b=0;
        int i=0;
        while (n>0) {
            int r=n%2;

          b=r*(int)Math.pow(10,i)+b;

            i=i+1;

            n/=2;
        }

        return b;
    }
    public static void main(String[] args){

        int n=10;

        System.out.println(dtb(n));


    }
}