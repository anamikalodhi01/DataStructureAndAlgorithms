package RecUsingArrays;

public class Min {
    public static int printMin(int[] arr, int n, int idx, int maxi){
        if(n==idx){
            return maxi;
        }
        maxi = Math.min(maxi, arr[idx]);
        return printMin(arr, n, idx + 1, maxi);
    }
    public static int printing(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        return printMin(arr , n , 0 , min);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(printing(arr));
    }
}
