package RecUsingArrays;
import java.util.*;

public class MinMax {
    public static int[] printMin(int[] arr, int n, int idx, int min, int maxi){
        
        if(n==idx){
            return new int[]{min, maxi};
        }
        maxi = Math.max(maxi, arr[idx]);
        min = Math.min(min, arr[idx]);
        return printMin(arr, n, idx + 1, min, maxi);
    }
    public static int[] printing(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        return printMin(arr , n , 0 , min, maxi);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = printing(arr);
        // System.out.println(Arrays.toString(ans));
        System.out.println("Maximum is " + result[0] + ". Minimum is " + result[1]); 
    }
}
