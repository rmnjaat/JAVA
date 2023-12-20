import java.util.Scanner;

public class twoDarray {

    public static void main(String[] args) {
        int arr[][]=new int[3][3];

        int n=arr.length;
        int m=arr[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(arr[i][j]+" ");
            }

            System.out.print("\n");
        }


    
    
    
    }
}