public class InsertionSort {
    public static void insertionSort(int arr[]){
        // tc - O(n^2)
        for(int i =0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev --;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
    }
}
