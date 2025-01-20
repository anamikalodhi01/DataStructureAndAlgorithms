public class ReverseArray {
    public static void printArray(int[] arr, int idx, int n){
        if(idx == n){
            return;
        }
        printArray(arr, idx +1 ,  n);
        System.out.print(arr[idx] + " ");
    }
    public static void main(String[] args) {
        int arr[] = {9,2,7,6,5,4,3,8};
        int n = arr.length;
        int idx =0;
        printArray(arr, idx, n);
    }
}
