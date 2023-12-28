public class quicksort {

    public static int partition(int arr[], int si, int ei) {
        int p = arr[ei];

        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= p) {
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } 
        }
        i++;
        int temp = p;
        arr[ei] = arr[i]; 
        arr[i] = temp;

        return i;

    }

    public static void quicksrt(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        // piviot

        int pIdx = partition(arr, si, ei);

        quicksrt(arr, si, pIdx - 1);
        quicksrt(arr, pIdx + 1, ei);

    }

    public static void main(String[] args) {

        int arr[] = { 6, 3, 9, 8, 2, 5 };

        int si = 0;
        int ei = arr.length - 1;

        quicksrt(arr, si, ei);


        for(int i=0;i<=ei;i++){
            System.out.print(arr[i]+" ");
        }
    }
}