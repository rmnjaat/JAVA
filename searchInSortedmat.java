public class searchInSortedmat {

    public static void staircasesearch(int arr[][],int key) {

        int i=0;
        int j=arr[0].length-1;

        while (i<=arr.length-1 && j>=0) {

            if(arr[i][j]==key){
                System.out.println("element found at "+i+" "+j);
                return;
            }
            else if(key<arr[i][j]){
                j--;
            }
            else if(key>arr[i][j]){
                i++;
            }
            
        }

        System.out.println("element not found");
        
    }
    public static void main(String[] args) {
        
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        staircasesearch(matrix,19);
    }
}