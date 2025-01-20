public class ArrayMax {
    public static int maxFind(int[] arr, int n, int idx, int maxi){
        if(idx == n){
            return maxi;
        }
        maxi = Math.max(maxi, arr[idx]);
        return maxFind(arr,n, idx +1 , maxi);
    }

    public static int Max(int[] arr){
        int n= arr.length;
        int maxi = Integer.MIN_VALUE;
        return maxFind(arr,n, 0,maxi);
    }
    public static void main(String[] args) {
        int[] arr = {9,2,7,6,5,4,3,8};
        System.out.println(Max(arr));
           
    }
}
