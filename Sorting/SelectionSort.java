import java.util.*;

public class SelectionSort {

    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i< n-1; i++){
            int min =i;
            for(int j=i; j<n; j++){
                if(arr[j] < arr[min]){
                    min =j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp; 
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int []ans = selectionSort(arr);

        for( int itr : ans){
            System.out.print(itr+ " ");
        }

    }
}
