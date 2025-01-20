public class RecArray {
    public static void printArray(int[] arr, int idx, int n){
        // normal approach

        // for(int i=0; i< arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // recursive approach

        if(idx == n){
            return;
        }
        
        System.out.print(arr[idx] + " ");
        printArray(arr, idx +1 ,  n);
    }
    public static void main(String[] args) {
        int arr[] = {9,2,7,6,5,4,3,8};
        int n = arr.length;
        int idx =0;
        printArray(arr, idx, n);
    }
}
