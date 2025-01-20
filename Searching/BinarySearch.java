import java.util.Scanner;

public class BinarySearch {
    
    public static void binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;

        while( start <= end){
            int mid = (start + end)/2;

            if(arr[mid]==key) return mid;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int []ans = binarySearch(arr);

        for( int itr : ans){
            System.out.print(itr+ " ");
        }
    }
}
